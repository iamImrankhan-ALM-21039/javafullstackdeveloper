package programs;

import java.util.Scanner;
public class PrintANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		//Creates a reader instance which takes
		//input from standard input - keyboard
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		// nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		
		//println() prints the following line to the output screen
		System.out.println("You entered: " + number);
	}

}
