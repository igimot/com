package Lesson2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println("Âàøå ÈÎ");
		System.out.println("Âàø âîçğàñò");
		int age = scan.nextInt();
		if ((age > 10) & (age < 16)) {
			System.out.println("Òîëüêî íå îôèöèàëüíî ìîæåì ïğèíÿòü");
		} else if ((age >= 16) & (age < 60)) {
			System.out.println("Âû ïğèíÿòû");
		} else
			System.out.println("Ñîğğè");

	}

}
