package day25_Review;

import java.util.Scanner;

public class NumbersGuessingGame {
	
	
	//make a game where the player guesses the number, if they
    //guess the number correct 3 times they will win
    //if they guess the number incorrect 10 times they lose
    //random number should be 1-3
	
	//uses method to make reuseble code and make it
	//easier to read
	
	static Scanner input = new Scanner(System.in);
	
	static int countGuess = 0;
	static int countInGuess = 0;
		

	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("guess a number between 1-3");
			
			int playersGuess = input.nextInt();
			
			int ranN = randomNum();
			
			//WinCheck
			
			winCheck(playersGuess, ranN);
			
			//Checkguess
				
			if (countGuess == 3) {
				System.err.println("You Won!!");
				break;
			}else if (countInGuess == 10) {
					System.err.println("You Lost!!");
					break;
				}
			
		
		
	}
	
	}


	private static void winCheck(int playersGuess, int ranN) {
		if(playersGuess == randomNum()) {
			System.out.println(ranN+"correct");
			countGuess++;
			
		}else {
			System.out.println(ranN+"Incorrect");
			countInGuess++;
			
		}
	}
	
	
	//Set varible value
	
	private static int randomNum() {
		
		return (int) ((Math.random() * (4-1))+1);
		
	}

	
	
	
	
	
	
	
	
	
	

		
		
	
		
		
		
		
		
		
		
		
		

	}


