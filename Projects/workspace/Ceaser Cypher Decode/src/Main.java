import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s;

		int d = 0;
		
		char z = 'z';
		char a = 'a';
		
		int zed = (int)z;
		int apple = (int)a;
		
		int rem;

		System.out.println("Please input the message to be decrypted:");

		s = scanner.next();

		System.out.println("Please input the day of the month the message was sent:");

		d = scanner.nextInt();

		String output = "";
		int counter = 0;
		while(counter < s.length())
		{
			//get next character
			char c = s.charAt(counter);
			//change to number
			int charCode = (int)c;
			//subtract
			charCode -= d;
			//if loop
			if(charCode < apple)
			{
				rem = apple - charCode;
				charCode = zed;
				charCode -= rem;
				
			}
			//change to character
			c = (char)charCode;
			//add it to output
			output += c;

			//increment
			counter++;
		}

		System.out.println(output);

	}

}
