package Lesson3;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scan.nextInt();
		int f = 1;
		for (int i = a; i > 0; i--) {
			f = f * i;
		}
		System.out.println("Факториал числа " + a + " = " + f);
	}

}
