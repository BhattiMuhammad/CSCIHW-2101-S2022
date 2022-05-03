package SquidGame; 
public class Main 
{
	// main method
	public static void main(String[] args)
	{
		// creating a game which has a ladder with 10 pannels
		Game g = new Game(10);
		
		// starting the game with 5 lives
		g.playGame(3);
	}
}
