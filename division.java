package programs;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter i value..:");
		
		int i=scan.nextInt();
		System.out.println("Please enter j value..:");
		int j=scan.nextInt();
		int sum=i/j;
		System.out.println("The division of i and j is..:"+sum);
	}

}
