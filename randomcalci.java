package programs;

import java.util.Scanner;

public class randomcalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any even no between 1 to 10");
		int a=scan.nextInt();
		System.out.println("multiply by 2");
		int b=scan.nextInt();
		System.out.println("add 4");
		int c=scan.nextInt();
		System.out.println("Divide by 2");
		int d=scan.nextInt();
		System.out.println("subtract with the even no you thought on first");
		int e=scan.nextInt();
		int sum=(a*b)+c;
		System.out.println("Your answer is :"+sum);
		
	}

}
