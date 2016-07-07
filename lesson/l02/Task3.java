package Lesson2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("сколько денег в кошельке");
		double denga = scan.nextDouble();
		System.out.println("стоимость товара");
		double tovar = scan.nextDouble();
		double o = denga / tovar;
		int mozno = (int) o;
		int t = (int) tovar * mozno;
		double ostatok = denga - (double) t;

		String res=("ѕотратите " + t + " гривень"+" и можно купить " + mozno + " товара " + ",а также ќсталось " + ostatok + " гривень");
		System.out.println(res);
		//System.out.println("можно купить " + mozno + " товара");
		//System.out.println("ќсталось " + ostatok + " гривень");

	}
}