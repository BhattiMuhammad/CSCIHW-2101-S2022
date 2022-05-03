package SquidGame; 
// this class represent the player
public class Player 
{
	// number of lives
	private int lives;
	
	// Constructor
	public Player(int lives)
	{
		this.lives = lives; 
	}
	
	// lives getter
	public int getLives()
	{
		return lives;
	}
	
	// this method kills a life of the player
	public void death()
	{
		lives -= 1;
	}
}
