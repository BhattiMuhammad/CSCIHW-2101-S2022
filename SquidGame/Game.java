package SquidGame; 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// this class represent the game
public class Game 
{
	// ladders (2D Array)
	private int[][] ladder;
	
	// constructor which take the number of panels in the parametres
	public Game(int panels)
	{
		// creating a Random Object
		Random r = new Random();
		
		// creating the ladder with the number of panels
		ladder = new int[panels][2];
		
		// setting the ladder values
		for (int i = 0; i <panels; i++)
		{
			// generating a random value ( 1 or 0 )
			int s = r.nextInt(2);
			
			// setting the left side of the panel to the generated number
			ladder[i][0] = s;
			
			// setting the other side to a differant value
			if (s == 0)
			{
				ladder[i][1] = 1;
			}
			else
			{
				ladder[i][1] = 0;
			}
		}
	}
	
	// this method print a full Ladder but without any answers
	public void LadderBlankPrinter()
	{
		System.out.println("|||||| ---- Start");
		
		for (int i = 0; i<ladder.length; i++)
		{
			System.out.println("| || |");
		}
		
		System.out.println("|||||| ---- Finish");
	}
	
	// this method print all the answers of a lader
	public void LadderAnswerPrinter()
	{
		System.out.println("|||||| ---- Start");
		
		for (int i = 0; i<ladder.length; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print("|"+ladder[i][j] + "|" );
			}
			System.out.println();
		}
		
		System.out.println("|||||| ---- Finish");
	}
	
	// this method takes as an argument the number of steps the player moved and print all the previous answers until it reaches the step
	public void LadderCurrentPrinter(int steps)
	{
		System.out.println("|||||| ---- Start");
		
		// printing the answers
		for (int i = 0; i<steps; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print("|"+ladder[i][j] + "|" );
			}
			System.out.println();
		}
		
		// checking if it was the last step
		if (steps == ladder.length)
		{
			System.out.println("|||||| ---- Finish");
		}
		else
		{
			System.out.println("|?||?|");
		}
		
	}
	
	// the main game logic loop
	public void playGame(int lives)
	{
		// scanner for reading data from the user
		Scanner s = new Scanner(System.in);
		// player object which represent the player
		Player p = new Player(lives);
		// to read answers from  the user
		char answer;
		// to store all the answers
		ArrayList<Character> answers = new ArrayList<Character>()
;		
		System.out.println("==========================");
		System.out.println("WELCOME TO SQUID GAME");
		System.out.println("==========================");
		System.out.println();
		
		LadderBlankPrinter();
		
		System.out.println();
		System.out.println("---------LEGEND-----------");
		System.out.println("0: Glass");
		System.out.println("1: Tempered Glass");
		System.out.println("--------------------------");
		System.out.println();
		
		// looping through all the ladder
		for (int i = 0; i < ladder.length; i++)
		{
			// printing the current state of the player (all steps)
			System.out.println("----------------------------------------");
			LadderCurrentPrinter(i);
			
			// looping until we get a valid input from the user
			do
			{
				// asking the user for input
				System.out.print("Which panel would you chose (L/R): ");
				answer = s.nextLine().charAt(0);
				
				// checking if he chosed the left side
				if (answer == 'L' || answer == 'l')
				{
					// if it's a normal glass then the player loses a life
					if (ladder[i][0] == 1)
					{
						System.out.println("You Lost 1 life");
						p.death();
					}
				}
				// checking if he chosed the right side
				else if (answer == 'R' || answer == 'r')
				{
					// if it's a normal glass then the player loses a life
					if (ladder[i][1] == 1)
					{
						System.out.println("You Lost 1 life");
						p.death();
					}
				}
				// wrong choise
				else
				{
					System.out.println("Wrong choise!");
				}
				
			}while(answer != 'L' && answer != 'l' && answer != 'R' && answer != 'r');
			
			// adding the answer to the ArrayList
			answers.add(answer);
			
			// checking if the player lost in order to break out of the loop
			if (p.getLives() == 0)
			{
				break;
			}
		}
		
		// checking if the player won
		if (p.getLives() != 0)
		{
			System.out.println("Congrats You Won!!");
			LadderAnswerPrinter();
		}
		// the player lost
		else
		{
			System.out.println("Total Lives: 0");
			System.out.println("YOU DIED");
		}
		
		// closing the scanner
		s.close();
	}

}
