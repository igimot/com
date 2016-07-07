package Lesson1;

import java.util.Scanner;

public class Chetnoe_ili_ne_chetnoe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("������� �����. (���� 9-������� �����)");
        int k = scan.nextInt();
        // * ������ ��������� ����� �� ��������� ����� 0. ���� ��, �� ���� ����
        // ��������� ���������
        if (k == 0) {
            System.out.println("�� ��� ����, � ���� ��� ����. ���������� ��� ���.");
        }
        // * ���� �������� ����� �� ����� 0. �����....
        else {
            // * ������ ������� ����� m=k/2, ��� ��� �� ��������� int
            // �� ����� ��������� �����, �������� 25/2=22 � �� 22,5 ;
            int m = k / 2;
            // * ������ ������ m+m ��� ������� m*2, �� ����� ������� q
            int q = m + m;
            // *� ��� ������ k=q, ���� ����� �� ������
            if (k == q) {
                System.out.println("���. ����� " + k + ", ������.");
            }
            // * ���� �� ����� ��, �� ������
            else {
                System.out.println("���. ����� " + k + ", �� ������.");
            }
        }

    }
}
