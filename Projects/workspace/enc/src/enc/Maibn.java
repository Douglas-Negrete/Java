package enc;

import java.util.Scanner;

public class Maibn 
{

	
	public static void main(String[] args) 
	{
		
		int num;
		String choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a four digit number: ");
		
		num = input.nextInt();//read in an integer

		encccc.encrypt(num);
		
		encccc.decrypt(num);
		
		
	}//end public static void main

}//end main