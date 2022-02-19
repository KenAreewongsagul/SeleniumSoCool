package day25_Review;

import java.util.Scanner;

public class Review {

	
		
	
//	Slot Machine Project
//
//	over view- make a slot machine that will display 3 numbers. player should get some starting cash.  
//	If player has zero money they they should see they lost or cant play. 
//	Numbers for the jack pots and how much it cost to play are up to you. 
//
//
//
//
//
//	requirments 
//
//
//
//
//
//	req 1. if all 3 numbers match, player should get the  mega jackpot (highest payout)
//
//	req 2. if one number is above 80 player should win jack pot level 1 (lowest)
//
//	req 3. if 2 numbers are about 80 player should win jack pot level 2 (middle pay out)
//
//	req 4. if all 3 numbers are about 80, player should get jack pot level 3 (second from highest)
//
//	req 5. player should be able to see how much money they have. 
//	 
//
//	 Hints: use the random number class to get your 3 random numbers.  
//	 use scanner class for user input. use methods to make your code more easy to write and read. 
//	
	
	
	
	static Scanner input = new Scanner(System.in);
	static int playersMoney = 0;
	
	
	static int megaJackPot = 200;
	static int level1 = 20;
	static int level2 = 60;
	static int level3 = 100;
	
	
	
	public static void main(String[] args) {
		
		double x = 11.11;
		System.out.println((int) x);
		
		int x2 = 11;
		System.out.println((double) x2);
		
	
		
		start();
	}


	
	private static void start() {
		
		
		System.out.println("before while loop");
		
		// stop when game over//No money
		while (playersMoney>=0) {
			
//			System.out.println("after while loop");
			
			if(playersMoney <= 0 ) {}
	
		askPlayerForMoney();
		
		if(playersMoney >= 0) {
			
			playSlot();
		}
		
		
		
		//Please insert monet
		if(playersMoney==1) {
			System.out.println("Please insert money");
			playersMoney=input.nextInt();
			
		}
		
		
	}
		
		
		
		
		
		
	}
	
	private static void playSlot() {
		
		showCash();
		System.out.println("eack 'play is $10\n press one to play");
		int playersChoice=input.nextInt();
		if(input.nextLine().equals("1"))
		
		showRandomNumbers();
		
		
	}



	private static void showCash() {
		
		System.out.println("you have $" +playersMoney);
		
	}



	private static void showRandomNumbers() {
		
		int ran1 = randomNum();
		int ran2 = randomNum();
		int ran3 = randomNum();
		System.out.println( ran1+" "+ ran2+" "+ran3);
		
		checkForWin (ran1,ran2,ran3);
		
	}



	private static void checkForWin(int ran1, int ran2, int ran3) {
		
		
		if(ran1==ran2 &&ran1==ran3) {
			
			giveMegaJackPot();
			
			return;
		}
		
		int[] arr = new int[] {ran1,ran2,ran3};
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >=80) {
				
				count++;
				
				
			}
			
		}
		
		if (count == 0) {
			
			
		} else if (count==1){
			
			giveJackPotlevel1();
				
			} else if(count==2){
				
				giveJackPotlevel2();
				
			}else if(count==3){
				giveJackPotlevel3();
			}
		
		//make sure reset to 0
				count = 0;
				
		
		
		}
		
		
		
		
		
		
		
		
		
	



	private static void giveJackPotlevel3() {
		System.out.println("You won the level3 jackpot");
		
		playersMoney+=level3;
		
				
	}



	private static void giveJackPotlevel2() {
		System.out.println("You won the level2 jackpot");
		playersMoney+=level2;
	}



	private static void giveJackPotlevel1() {
		System.out.println("You won the level1 jackpot");
		playersMoney+=level1;
	}



	private static void giveMegaJackPot() {
		System.out.println("**********Congrats you won the mega jackpot*********");
		
		playersMoney += megaJackPot;
	}



	private static void askPlayerForMoney() {
		
		//Please insert money
				if(playersMoney<=0) {
					System.out.println("Please insert money");
					playersMoney=input.nextInt();
		

				}
	}



	private static int randomNum() {
		return (int) Math.random() * (100 - 0) + 0 ;
		
	}
	
	
	
	
	//L will stand for level
	//these are class variables. 
//	static int L1JackPot= 10;
//	static int L2JackPot= 30;
//	static int L3JackPot= 50;
//	static int megaJackPot=200;
//	
//	static int playersCash=100;
//	static int costPerPlay= 10; 
//	//static boolean playerHasMoney=true;
//	static Scanner input= new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//		
//		start();
//		end();
//	}
//
//private static void end() {
//		
//		System.out.println("you lost");
//	}
//
//public static void start() {
//	
//	
//	
//	while(playersCash>0) {
//		
//		System.out.println("Press 1 to play");
//		showCash();
//		
//		String playerInput= input.nextLine();
//		
//		if(playerInput.equals("1")) {
//			
//			playSlot();
//			
//			clearScreen();
//		}
//	
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	
//}
//
//private static void clearScreen() {
//	System.out.println("\n\n\n\n\n\n");
//	
//}
//
//private static void playSlot() {
//		int randomNum1=randomNum();
//		int randomNum2=randomNum();
//		int randomNum3=randomNum();
//
//	
//		playersCash-=costPerPlay;
//		
//	System.out.println(randomNum1+" "+randomNum2+" "+randomNum3);
//			
//	//10 10 10
//
//	
//	if(randomNum1==randomNum2&&randomNum1==randomNum3) {
//		giveMegaJackPot();
//		return;
//	}
//							//10      100         99
//	int[] arr= new int[] {randomNum1,randomNum2,randomNum3};
//	
//	int count=0;
//	
//	for (int i = 0; i < arr.length; i++) {
//		System.err.println(arr[i]+" im random num inside the for loop");
//		System.err.println(count+ " im the count");
//		if (arr[i]>=80){
//			count+=1;
//			
//		}
//	}
//	
//	switch(count) {
//	
//	case 0:System.out.println("you lost");
//			showCash();
//			break;
//	case 1:giveLevel1JackPot();
//			break;
//	case 2:giveLevel2JackPot();
//			break;
//	case 3:giveLevel3JackPot();
//			break;
//	}
//	
//	
//	count=0;
//	
//	
//				
//	
//	
//}
//
//private static void giveLevel3JackPot() {
//	System.out.println("you won level three jack pot");
//	playersCash+=L3JackPot;
//	showCash();
//}
//
//private static void giveLevel2JackPot() {
//	System.out.println("you won level two jack pot");
//	playersCash+=L2JackPot;
//	showCash();
//}
//
//private static void giveLevel1JackPot() {
//	System.out.println("you won level one jack pot");
//	playersCash+=L1JackPot;
//	showCash();
//	
//}
//
//private static void giveMegaJackPot() {
//		System.out.println("*********congrats you won the mega jack pot*******");
//		playersCash+=megaJackPot;
//		showCash();
//	
//		
//	
//}
//
//private static void showCash() {
//	System.out.println("you now have $"+playersCash );
//}
//
//private static int randomNum() {
//	return (int) ((Math.random() * (100 - 0)) + 0);
//}
//	
//	
//	
//	
//	
//	
//}

		
		
		
		
		
		
		
		
		
		
		
		
	

	}


