package enc;

import java.util.Scanner;


public class encccc 
{

	public static void encrypt(int num) 
	{
		
		int encrypt1 = 0;
		int encrypt2 = 0;
		int encrypt3 = 0;
		int encrypt4 = 0;
		
		int remainder1 = 0;
		int remainder2 = 0;
		int remainder3 = 0;
		
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		
		Scanner input = new Scanner(System.in);
		
		if(num > 9999)
		{
			System.out.println("Number must only be four digits.");
		}//end if
		
		else
		{
		
		if(num >= 1000 || num < 1000)
		{
			remainder1 = num % 1000;
			first = num / 1000;
		}//end if
		
		if(remainder1 >= 100 || remainder1 < 100)
		{
			remainder2 = remainder1 % 100;
			second = remainder1 / 100;
		}//end if
		
		if(remainder2 >= 10 || remainder2 < 10)
		{
			remainder3 = remainder2 % 10;
			third = remainder2 / 10;
		}//end if
		
		if(remainder3 >= 1 || remainder3 < 1)
		{
			fourth = remainder3 / 1;
		}//end if
		
		}//end else
		
		encrypt1 = (first + 7) % 10;
		
		encrypt2 = (second + 7) % 10;
		
		encrypt3 = (third + 7) % 10;
		
		encrypt4 = (fourth + 7) % 10;
		
		System.out.println("Encrypted Number: " + encrypt3 + encrypt4 + encrypt1 + encrypt2);
		
	}
	
	public static void decrypt(int num) 
	{
		
		int decrypt1 = 0;
		int decrypt2 = 0;
		int decrypt3 = 0;
		int decrypt4 = 0;
		
		int remainder1 = 0;
		int remainder2 = 0;
		int remainder3 = 0;
		
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		
		Scanner input = new Scanner(System.in);
		
		if(num > 9999)
		{
			System.out.println("Number must only be four digits.");
		}//end if
		
		else
		{
		
		if(num >= 1000 || num < 1000)
		{
			remainder1 = num % 1000;
			first = num / 1000;
		}//end if
		
		if(remainder1 >= 100 || remainder1 < 100)
		{
			remainder2 = remainder1 % 100;
			second = remainder1 / 100;
		}//end if
		
		if(remainder2 >= 10 || remainder2 < 10)
		{
			remainder3 = remainder2 % 10;
			third = remainder2 / 10;
		}//end if
		
		if(remainder3 >= 1 || remainder3 < 1)
		{
			fourth = remainder3 / 1;
		}//end if
		
		}//end else
		
		//----------------------------------------------
		
		if(first == 0 || first == 1 || first == 2 || first == 3 || first == 4 || first == 5 || first == 6)
		{
			decrypt1 = (first + 3) % 10;
		}
		
		if(first == 7 || first == 8 || first == 9)
		{
			decrypt1 = (first - 7);
		}
		
		//------------------------------------------
		
		if(second == 0 || second == 1 || second == 2 || second == 3 || second == 4 || second == 5 || second == 6)
		{
			decrypt2 = (second + 3);
		}
		
		if(second == 7 || second == 8 || second == 9)
		{
			decrypt2 = (second - 7);
		}
		
		//---------------------------------------
		
		if(third == 0 || third == 1 || third == 2 || third == 3 || third == 4 || third == 5 || third == 6)
		{
			decrypt3 = (third + 3);
		}
		
		if(third == 7 || third == 8 || third == 9)
		{
			decrypt3 = (third - 7);
		}
		
		//---------------------------------------
		
		if(fourth == 0 || fourth == 1 || fourth == 2 || fourth == 3 || fourth == 4 || fourth == 5 || fourth == 6)
		{
			decrypt4 = (fourth + 3);
		}
		
		if(fourth == 7 || fourth == 8 || fourth == 9)
		{
			decrypt4 = (fourth - 7);
		}
		
		//---------------------------------------
		
		System.out.println("Decrypted Number: " + decrypt3 + decrypt4 + decrypt1 + decrypt2);
		
	}
	
	
}//end class




/*1. Denotes that a member variable, or method, can be accessed without requiring an instantiation of the class to which it belongs.

2. A static class allows you to call upon the data from within, but not change it.

3. It is good for static, because it means that no one can tamper with the encryption math.

4. As it is, it would still run. You could write an “if” that sends an error message when there is more than 4 digits. An exception is something allows the code to run, if the parameters not met.
*/