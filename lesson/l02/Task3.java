package Lesson2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� � ��������");
		double denga = scan.nextDouble();
		System.out.println("��������� ������");
		double tovar = scan.nextDouble();
		double o = denga / tovar;
		int mozno = (int) o;
		int t = (int) tovar * mozno;
		double ostatok = denga - (double) t;

		String res=("��������� " + t + " �������"+" � ����� ������ " + mozno + " ������ " + ",� ����� �������� " + ostatok + " �������");
		System.out.println(res);
		//System.out.println("����� ������ " + mozno + " ������");
		//System.out.println("�������� " + ostatok + " �������");

	}
}