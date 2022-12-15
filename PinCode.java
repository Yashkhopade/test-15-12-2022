package test.java;

import java.util.Scanner;

public class PinCode {

	public static void main(String[] args) {
		
		int pin,i ;
		int guess;
		int trial=0;
		
		Scanner sc = new Scanner(System.in);
		
		pin=12345;
		
		System.out.println("Welcome ...");
	
		
		for( i=1;i<=3;i++) {
			trial++;
			
			System.out.println("Enter your pin");
			
			guess= sc.nextInt();
			
			if(guess==pin) {
				System.out.println("Correct,welcome back.");
				break;
				
			}
			else {
					System.out.println("incorrect,try again ");
					
				}
		}
		
			if(trial==3)
			{
				System.out.println("Sorry but you have been locked out");
				
			}
		
		
		

		}

}
