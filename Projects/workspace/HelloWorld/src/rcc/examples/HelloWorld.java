package rcc.examples;

import java.util.Scanner;

public class HelloWorld
{
	
/**
 * @param args0 is input from command line
 */
	
	public static void main(String[] args)
	{
		
		//System.out.println("Hello World");
		
		//Primitive
		
		//int a = 0;
		//double m = 1;
		//char c = 'c';
		
		//if you want to cast a double into an int you must cast it
		
		//a = (int) m;
		
		//boolean isValid = true;
		//float f = 1;
		
		//Objects
		
		//Integer aInt = 0;
		//Double h = null;
		//Character c1 = null;
		//Boolean b = null;
		
		//lesson
		
		//int A = 2;
		//int B = 4;
		//int C = A + B;
		
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please give an int for a:");
		a = input.nextInt();
		System.out.println("Please give an int for b:");
		b = input.nextInt();
		input.close();
		
		int c = a + b;
		
		System.out.println(c);
		
		for(int i = 1; i <= 100 ; i++)
		{
			
			if(i%3==0)
			{
				
				System.out.println("fizz" + " " + i);
				
			}
			if(i%5==0)
			{
				
				System.out.println("bizz" + " " + i);
				
			}
			if(i%3==0 && i%5==0)
			{
				
				System.out.println("fizzbizz" + " " + i);
				
			}
			
		}
		
		
		
	}
	
}
