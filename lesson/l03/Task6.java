package Lesson3;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt() ;
		boolean isEnd = false;
		
		

		while (!isEnd) {
			System.out.print("*");
			a=a-1;
			if (a == 0)
				isEnd = true;
		}

		scan.close();

	}

}