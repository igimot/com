package Lesson3;

import java.util.Scanner;

public class Task5 { public static void main(String[] args) {
	
	  
	  Scanner scan = new Scanner (System.in);
	  boolean isEnd = false;
	  int k=0;
	  
	  while(!isEnd){
	   int a = (int)(Math.random()*100);
	   int a1=a/10;
	          if (a==a1*10){
	           System.out.println(a);
	          }
	            
	   k=k+1;
	   if(k==10)isEnd =true;
	  }
	  
	  scan.close();
	  

	 }

	}