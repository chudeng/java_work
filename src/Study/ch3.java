package Study;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//3-1
		/*if (num < 0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		}
		if (num > 0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		}*/
		
		//3-2
		/*if (num < 0) {
			System.out.println(num + "�� ���밪: " + (num * (-1)));
		}
		if (num > 0) {
			System.out.println(num + "�� ���밪: " + num);
		}
		System.out.println(num + "�� ���밪: " + Math.abs(num));*/
		
		//3-3
		/*if (num1%num2 == 0) {
			System.out.println(num2 + "�� " + num1 + "�� ����̴�.");
		} else {
			System.out.println(num2 + "�� " + num1 + "�� ����� �ƴϴ�.");
		}*/
		
		//3-5
		/*if (num1 < 0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		} else if (num1 == 0) {
			System.out.println("�� ���� 0 �Դϴ�.");
		} else {
			System.out.println("�� ���� ���� ���Դϴ�.");
		} */
		
		//3-7
		/*if (num1 < num2) {
			System.out.println(num1 + "�� ũ��.");
		} else if (num1 == num2) {
			System.out.println(num1 + "�� " + num2 + "�� ����.");
		} else {
			System.out.println(num1 + "�� �۴�.");
		} */
		
		//3-8
		/*if (num1 < 0) {
			System.out.println("���� �������� �Է� �߽��ϴ�.");
		} else if (num1%5 == 0) {
			System.out.println("5�� ������ �������ϴ�.");
		} else {
			System.out.println("5�� ������ �������� �ʽ��ϴ�.");
		}*/
		
		//3-9
		/*if (num1%10 == 0) {
			System.out.println("10�� ��� �Դϴ�.");
		} else {
			System.out.println("10�� ����� �ƴմϴ�.");
		}*/
		
		//3-10
		/*if (num1 < 0) {
			System.out.println("����� �ƴ� ���� �Է� �߽��ϴ�.");
		} else {
			System.out.println("�� ���� 3���� ������ ���ϴ�.");
			switch (num1%3) {
			case 1:
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			case 2:
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
			}
		}*/
		
		//3-11
		if (num1<0 || num1>100) {
			System.out.println("�߸��� ���� �Դϴ�.");
		}else {
			if (num1 >= 80) {
				System.out.println("��");
			}else if (num1 >= 70) {
				System.out.println("��");
			}else if (num1 >= 60) {
				System.out.println("��");
			}else if (num1 >= 50) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}	
		}
		
		
		sc.close();

	}

}
