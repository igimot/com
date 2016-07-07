package Lesson3;

import java.util.Scanner;

//организовать ввод чисел пока не будет введен 0
public class Task4 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean isEnd=false;
		while (!isEnd){
			System.out.println("¬ведите число");
			int res=scan.nextInt();
			if(res==0) isEnd=true;
		}
		
	}

}
