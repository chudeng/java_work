package Study;

import java.util.Scanner;

public class ch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		5-1: 8���� 12, 10���� 12, 16���� 12�� ���� 10������ ǥ���ϴ� ���α׷��� �ۼ��ϼ���.
		/*
		System.out.println("8���� 12�� 10������ " + 012);
		System.out.println("10���� 12�� 10������ " + 12);
		System.out.println("16���� 12�� 10������ " + 0x12);
		int num = sc.nextInt();
		String num2 = Integer.toBinaryString(num);
		String num8 = Integer.toOctalString(num);
		String num16 = Integer.toHexString(num);
		System.out.println(num2);
		System.out.println(num8);
		System.out.println(num);
		System.out.println(num16);
		*/
		
//		5-2: 10���� ������ 8������ 16������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(print ���Ĺ��� Ȱ��)
		/*
		System.out.print("��ȯ�� 10������ �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println(num + "�� 8����:" + Integer.toOctalString(num));
		System.out.println(num + "�� 16����:" + Integer.toHexString(num));
		System.out.printf("%d�� 8����:%o\n", num, num);
		System.out.printf("%d�� 16����:%h", num, num);
		*/
		
//		5-3: float�� ������ double�� ������ ���� �о ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		System.out.print("���ϴ� double�� ������ �Է��ϼ���:");
		double dNum = sc.nextDouble();
		System.out.print("���ϴ� float�� ������ �Է��ϼ���:");
		float fNum = sc.nextFloat();
		
		System.out.printf("double�� ����: %d, float�� ����: %f", dNum, fNum);
		*/
		
//		5-4: ���� ������ true�� false�� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		System.out.print("true or false?");
		boolean b1 = sc.nextBoolean();
		System.out.print("true or false?");
		boolean b2 = sc.nextBoolean();
		System.out.print("b1: " + b1 + "\nb2: " + b2);
		sc.close();
		*/
		
//		5-5: 3���� �������� �о �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ����� �Ǽ��� ǥ���ϼ���.
		/*
		double mean = 0;
		int sum = 0;
		int count = 0;
		for (int i = 1; i <4; i++) {
			System.out.print(i + "���� ���� �Է�: ");
			int input = sc.nextInt();
			sum += input;
			count ++;
		}
		mean = sum/count;
		System.out.printf("�հ�: %d\n���: %.2f", sum, mean);
		*/
		
//		5-6: int�� ������ �Ǽ����� �����ؼ� ǥ���ϴ� ���α׷�.
		/*
		int num = 0;
		num = (int)1.234;
		System.out.println(num);
		*/
		
//		5-8: float ���� ������ 0.0���� 1.0���� 0.001�� ������Ű�� ǥ���ϰ�,
//		�� ���� int�� ������ 0���� 1000���� 1���� ������Ű�� 1000���� ���� ���� (�Ǽ���)ǥ���Ͻÿ�
//		(�Ҽ��� ���� 7�ڸ����� ǥ���ϼ���.)
		float fNum1 = 0;
		float fNum2 = 0;
		System.out.println("float\t\tint\n-------------------------------");
		for (int i = 0; i<=1000; i++) {
			fNum2 = ((float)i/1000);
			fNum1 = fNum2;
			System.out.printf("%.7f\t%.7f\n", fNum1, fNum2);
		}
	}

}
