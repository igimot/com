package Lesson2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		
		// конкатенация

		String query = "Ваше имя";
		System.out.println(query);
		name = scan.next();
		String hello = "Привет  " + name;
		System.out.println(hello);

	}
}
