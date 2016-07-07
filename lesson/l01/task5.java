package Lesson1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("������� ����� 1");
        int k = scan.nextInt();

        System.out.println("������� ����� 2");
        int l = scan.nextInt();

        System.out.println("������� ����� 3");
        int m = scan.nextInt();

        if (k > l) {
            if (k > m) {
                System.out.println("����� 1 ������ ����� 2 � 3");
            } else {
            }
        }
        if (l > k) {
            if (l > m) {
                System.out.println("����� 2 ������ ����� 1 � 3");
            }
        }
        if (m > k) {
            if (m > l) {
                System.out.println("����� 3 ������ ����� 1 � 2");
            }
        }

    }
}
