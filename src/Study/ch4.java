package Study;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//4-1
		/*while(true) {
			System.out.println("���ϴ� �������� �Է� �ϼ���(����: 0)");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else if (num > 0) {
				System.out.println("�Է��Ͻ� ���� ��� �Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ���� ���� �Դϴ�.");
			} 
		}*/
		
		/*int num = 0;
		do {
			System.out.println("���ϴ� �������� �Է� �ϼ���(����: 0)");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("�Է��Ͻ� ���� ��� �Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ���� ���� �Դϴ�.");
			} 
		} while(num != 0);
		
		System.out.println("�����մϴ�.");*/
		
		//4-2
		/*while(true) {
			System.out.println("3�ڸ� ���� �������� �Է��ϼ���.");
			int num = sc.nextInt();
			if (num  < 100) {
				System.out.println("3�ڸ� ���� ������ �������� �ʽ��ϴ�.");
			} else if(num > 999) {
				System.out.println("3�ڸ� ���� ������ �������� �ʽ��ϴ�.");	
			} else {
				System.out.println("�Է��� ��: " + num);
				break;
			}
		}*/
		
		//4-3
		/*int Qnum = rand.nextInt(90)+10;
		int answer = 0;
		do {
			System.out.println("2�ڸ� ���ڸ� �Է��ϼ���:");
			answer = sc.nextInt();
			if (Qnum > answer) {
				System.out.println("Up!");
			} else if (Qnum < answer) {
				System.out.println("Down!");
			}
		} while (Qnum != answer); {
			System.out.println("You win!");
		}*/
		
		//4-4
		/*System.out.println("First num input");
		int num1 = sc.nextInt();
		System.out.println("Second num input");
		int num2 = sc.nextInt();
		int size = Math.abs(num2-num1);
		int array[] = new int[size+1];
		if (num1 > num2) {
			for (int i = 0; i < size+1; i++) {
				array[i] = i+num2;
			}
		}else if (num2 > num1) {
			for (int i = 0; i < size+1; i++) {
				array[i] = i+num1;
			}
		}else {
			array[0] = num1;
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		*/
		
		//4-5
		/*System.out.println("input any number to be counted.");
		int num = sc.nextInt();
		if (num > 0) {
			do {
				System.out.println(num--);
			} while(num != 0); {
				System.out.println(num);
				System.out.println("���� �� ���� ��:" + (num-1));
			}
		} else if (num < 0) {
			do {
				System.out.println(num);
				num ++;
			} while(num != 0); {
				System.out.println(num);
				System.out.println("���� �� ���� ��:" + (num+1));
			}
		}*/
		
		//4-7
		/*int num = sc.nextInt();
		String star = "*";
		String stars = ""; 
		
		if (num < 1) {
			System.out.println("");
		} 
		
		if (num >= 1 ) {
			for (int i = 0; i < num ; i++) {
					stars = stars + star;
			}
			System.out.println(stars + "\n");
		}*/
		
		//4-8
		/*System.out.print("Input number as quantity to be printed out:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (i%2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("*");
			}
		}
		System.out.println("\n");
		*/
		
		//4-9
		/*int num = 0;
		int count = 0;
		do {
			System.out.print("Input positive number to be printed out:");
			num = sc.nextInt();
		}while (num <= 0); {
			//System.out.println((int)(Math.log10(num)+1));
//			int count = 0;
//			while(num != 0) {
//				num = num/10;
//				count ++;
//				
//			}
//			System.out.println(count);	
			for(int i=10; num != 0; count++) {
				num = num/i;
			}
			System.out.println(count);
		}*/
		
		//4-10
		/*
		int num = 0;
		int factorial = 1;
		do {
			System.out.print("Input positive number to be factorial: ");
			num = sc.nextInt();
		}while(num <= 0);{
			while(num != 0) {
				factorial = factorial * num;
				num --;
			}
		}
		System.out.println("factorial value: " + factorial);
		*/
	}
}
