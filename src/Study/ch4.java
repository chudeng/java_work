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
		
		//4-13: �Է¹��� �������������� 0���� ī��Ʈ ��.
		/*
		int num = 0;
		do {
			System.out.print("�������� �� �Է�:");
			num = sc.nextInt();
		}while (num < 0);{
		}
		System.out.println("ī��Ʈ�� �����մϴ�.");
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
			
		}*/
		
		//4-14: 1���� n������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for��)
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("�������� �� �Է�:");
			num = sc.nextInt();
		} while (num < 0);{
			
		}
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.print(num + "������ ��:" + sum);
		*/
		
		//4-15: 4-14 ���α׷��� �����ؼ� ����Ӹ� �ƴ϶� ���ı��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*int num = 0;
		int sum = 0;
		do {
			System.out.print("�������� �� �Է�:");
			num = sc.nextInt();
		} while (num < 0);{
			
		}
		
		System.out.print(num + "������ ��:");
		
		for (int i = 1; i < num; i++) {
			sum = sum + i;
			System.out.print(i + "+");
		}
		System.out.print(num + "=" + (sum + num));
		*/
		
		//4-16: ���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷��� �ۼ�.
		//ǥ�� ü�� = (���� - 100) * 0.9
		//ǥ���� ������ ����(�ּ�/�ִ�/������)�� ���������� �Է� ���� ��.
		/*System.out.println("���庰 ǥ�� ü�� ����ǥ");
		System.out.print("���� �ִ밪: ");
		int max = sc.nextInt();
		System.out.print("���� �ּҰ�: ");
		int min = sc.nextInt();
		System.out.print("���� ������: ");
		int increasment = sc.nextInt();
		System.out.println("����-->(�ּҰ�: " + min + " �ִ밪: " + max + " ������: " + increasment + ")\n\t����\t|\tǥ��ü��\n------------------------------------");
		
		for (; min <= max; min = min + increasment) {
			double standard = 0;
			standard = (min - 100) * 0.9;
			System.out.println("\t" + min + "\t|\t" + standard);
		}*/
		
		//4-17: �Է��� ����ƴ '*'�� ǥ���ϴ� ������ �����ؼ� 5�� ������ �ٹٲ��ؼ� ǥ��.
		/*
		int num = 0;
		System.out.print("����� ���� ����: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int remainder = i%5;
			System.out.print("*");
			if (i >= 5 && remainder == 0) {
				System.out.print("\n");
			}
		}
		*/
		
		//4-18: �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷�
		/*
		int aliquot = 0;
		int num = 0;
		do {
			System.out.print("���� �Է�:");
			num = sc.nextInt();
		}while(num <= 0);
		
		System.out.print(num + "�� ��� �� ����\n���:");
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				System.out.print(i + " ");
				aliquot ++;
			}
		}
		System.out.println("\t����: " + aliquot);
		*/
		
		//4-19: 1���� n������ �������� �� ���� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		int num = 0;
		do {
			System.out.print("���� �Է�:");
			num = sc.nextInt();
		}while(num <= 0);
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "�� ������ " + (i * i) + " �Դϴ�.");
		}
		*/
		
		//4-20: ��(��)�� ���������� �Է¹޾Ƽ� �ش��ϴ� ���� ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//���ϴ� ��ŭ �Է� �� ����� �� �ְ� �ϰ�, 1~12 �̿��� ���� �ԷµǴ� ���, ���Է� �ǵ��� �� ��.
		/*
		int num = 0;
		int Continue = 0;
		do {
			System.out.print("���� �Է�:");
			num = sc.nextInt();
			if(num >= 1 && num <= 12) {
				if(num == 12 || num == 1 || num == 2) {
					System.out.println(num + "���� �ܿ��Դϴ�.");
				} else if(num == 3 || num == 4 || num == 5) {
					System.out.println(num + "���� ���Դϴ�.");
				} else if(num == 6 || num == 7 || num == 8) {
					System.out.println(num + "���� �����Դϴ�.");
				} else{
					System.out.println(num + "���� �����Դϴ�.");
				}
				do {
					System.out.print("�ٽ� �Է� �Ͻðڽ��ϱ�? (Yes: 1, No: 0): ");
					Continue = sc.nextInt();
				} while (Continue != 1 && Continue != 0);
			}	
		} while(num < 1 || num > 12 || Continue == 1);
		*/
		
		//4-21: ��ȣ ���� '*'�� �����ؼ� n���� ������(���簢����)ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		int num = 0;
		do {
			System.out.print("���簢�� ũ�� �Է�(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		//4-21**: ��ȣ ���� '*'�� �����ؼ� 3x5 ���簢���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		int num = 0;
		do {
			System.out.print("���簢�� �� �Է�(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		//4-22: "*"�� �����ؼ� ���� �ﰢ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		//- ������ġ�� ���� �Ʒ� �ϳ�, ���� �� �ϳ� ���� ǥ�õǰ�
		/*
		int num = 0;
		do {
			System.out.print("���簢�� �� �Է�(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		//4-23:"*"�� n���� �̵�ﰢ���� ǥ���ϴ� ���α׷��� �ۼ��ϼ���.
		/*
		int num = 0;
		do {
			System.out.print("���ﰢ�� �� �Է�(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		
		for (int i = 1; (i/2) < num; i = i + 2) {
			for (int j = (num-(i/2)); j >= 2; j--) {
				System.out.print(" ");
			}
			
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}	
			System.out.println("");
			
		}
		*/
		
		//4-24: n���� ���� �Ƕ�̵带 ǥ���ϴ� ���α׷��� �ۼ��ϼ���.
		// ���ڸ��������� ����ϸ�, 2�ڸ����� 1�� �ڸ� ���ڷ� ǥ��.
		/*
		int num = 0;
		do {
			System.out.print("���ﰢ�� �� �Է�: ");
			num = sc.nextInt();
		}while (num <=0);
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int l = 1; l <= (2*i)-1; l++) {
				System.out.print((i%10));
			}	
			System.out.println("");
			
		}
		*/
		
		//4-25: ���� �������� �Է¹޾Ƽ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//�� 2�̻� n�̸��� �� �� ��� ���ε� ���������� �ʴ� ������ n�̴�.
//		(��, 1�� �ڱ� �ڽ����θ� ������ �������� ��)
		/*
		int num = 0;
		do {
			System.out.print("2 �̻��� ���� �������� �Է��ϼ���: ");
			num = sc.nextInt();
		}while (num <= 1);
		
		for (int i = 2; i <= num; i++) {
			if (num == i) {
				System.out.println(num + "��(��) �Ҽ� �Դϴ�.");
			} else if (num%i == 0) {
				System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
				break;
			}
		}
		*/
		
		//4-26: �������� ������ �Է¹޾� �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		(0 �Է� ������ ���α׷� ����)
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("��� ������ �Է� �ұ��? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		int[] inputNum = new int[num];
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "��° ������ �Է��ϼ���(����:0): ");
			inputNum[i] = sc.nextInt();
			if (inputNum[i] == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
			sum = sum + inputNum[i];
		}

		System.out.println("�Է��� ���� ��: " + sum);
		System.out.println("�Է��� ���� ���: " + (sum/(double)num));
		*/
		
//		4-27: �������� �Է¹޾� �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for �� ���)
//		�������� �Է��� �հ谡 1000�� ���� �ʴ� �������� �̷�������� �ϼ���.
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("��� ������ �Է� �ұ��? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		int[] inputNum = new int[num];
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "��° ������ �Է��ϼ���(����:0): ");
			inputNum[i] = sc.nextInt();
			if (inputNum[i] == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else if ((sum + inputNum[i]) > 1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�. ������ ���� ������ ������ �Է°��� �հ� ����� ǥ�� �մϴ�.");
				System.out.println("�Է��� ���� ��: " + sum);
				System.out.println("�Է��� ���� ���: " + (sum/(double)num));
				break;
			} else {
				sum = sum + inputNum[i];
			}
		}
		*/
		
//		4-28: �������� �Է¹ް�, �Է¹��� ������ ������ ������ ������ ���� �հ� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for ��)
		int num = 0;
		int sum = 0;
		int countPositive = 0;
		int countNegative = 0;
		do {
			System.out.print("��� ������ �Է� �ұ��? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "��° ������ �Է��ϼ���(����:0): ");
			int inputNum = sc.nextInt();
			if (inputNum == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else if ( inputNum < 0) {
				countNegative = countNegative + 1;
				continue;
			} else {
				countPositive = countPositive + 1;
				sum = sum + inputNum;
			}
		}
		System.out.println("�Է��� ���� ��: " + sum);
		System.out.println("�Է��� ���� ���: " + (sum/(double)countPositive));
	}
	
}
