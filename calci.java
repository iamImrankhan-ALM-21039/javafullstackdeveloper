package programs;

import java.util.Scanner;
public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value....");
		int a = scan.nextInt();
		System.out.println("Please enter b value.....");
		int b = scan.nextInt();
		System.out.println("Please enter c value.....");
		int c = scan.nextInt();
		
		int sum = (a * b) + c;
		System.out.println("The value of expression is "+sum);

	}

}
