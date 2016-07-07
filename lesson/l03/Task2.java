package Lesson3;
import java.util.Scanner;

public class Task2 {
	public static void main (String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Введите Цену");
		double cena=scan.nextDouble();
		System.out.println("Введите Остаток товара");
		double tovar=scan.nextDouble();
		if ((cena<100)&(tovar<20)){
			System.out.println("Надо закупится");}
		
	else {
		System.out.println("все хорошо товара хватает");
	}}
		
		

}
