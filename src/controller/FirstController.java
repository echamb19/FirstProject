package controller;

import java.util.Scanner;

public class FirstController 
{
	public void start() 
	
	private void questions ()
	
	private void more Input()
	
	public boolean validInt(String sample) 
	
	{
		boolean isValid = false; //If its wrong...
		
		try
		{
			Integer.parseInt(sample);
			isValid = true; // Nothing happens (I think)
		}
		catch(NumberFormatException error) //Catches it if you do it wrong. 
		{
			System.out.println("You need to type in a number mammal!"); //Is what is said if you do it wrong.
		}
		
		return isValid; //Stops the program from crashing when you don't type in the right thing
		
		
		//System.out.println("Words go here");
		//System.out.println("This is more fun than I'd thought it would be.");
		//System.out.println("I love Taco's!!! :D");
	}
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example); 
			isValid = true; 
		}
		catch(NumberFormatException opps)
		{
			System.out.println("Only numbers with a . in it (floating point values) are accepted.");
		}
		
		return true; 
	}
}

