package Study;

import java.util.Scanner;

public class ch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		5-1: 8진수 12, 10진수 12, 16진수 12를 각각 10진수로 표시하는 프로그램을 작성하세요.
		/*
		System.out.println("8진수 12는 10진수로 " + 012);
		System.out.println("10진수 12는 10진수로 " + 12);
		System.out.println("16진수 12는 10진수로 " + 0x12);
		int num = sc.nextInt();
		String num2 = Integer.toBinaryString(num);
		String num8 = Integer.toOctalString(num);
		String num16 = Integer.toHexString(num);
		System.out.println(num2);
		System.out.println(num8);
		System.out.println(num);
		System.out.println(num16);
		*/
		
//		5-2: 10진수 정수를 8진수와 16진수로 표시하는 프로그램을 작성하시오.(print 서식문자 활용)
		/*
		System.out.print("변환할 10진수를 입력하세요:");
		int num = sc.nextInt();
		System.out.println(num + "의 8진수:" + Integer.toOctalString(num));
		System.out.println(num + "의 16진수:" + Integer.toHexString(num));
		System.out.printf("%d의 8진수:%o\n", num, num);
		System.out.printf("%d의 16진수:%h", num, num);
		*/
		
//		5-3: float형 변수와 double형 변수에 값을 읽어서 표시하는 프로그램을 작성하시오.
		/*
		System.out.print("원하는 double형 변수를 입력하세요:");
		double dNum = sc.nextDouble();
		System.out.print("원하는 float형 변수를 입력하세요:");
		float fNum = sc.nextFloat();
		
		System.out.printf("double형 변수: %d, float형 변수: %f", dNum, fNum);
		*/
		
//		5-4: 논리형 변수에 true나 false를 대입해서 표시하는 프로그램을 작성하시오.
		/*
		System.out.print("true or false?");
		boolean b1 = sc.nextBoolean();
		System.out.print("true or false?");
		boolean b2 = sc.nextBoolean();
		System.out.print("b1: " + b1 + "\nb2: " + b2);
		sc.close();
		*/
		
//		5-5: 3개의 정수값을 읽어서 합계와 평균을 구하는 프로그램을 작성하시오. 평균은 실수로 표현하세요.
		/*
		double mean = 0;
		int sum = 0;
		int count = 0;
		for (int i = 1; i <4; i++) {
			System.out.print(i + "번재 정수 입력: ");
			int input = sc.nextInt();
			sum += input;
			count ++;
		}
		mean = sum/count;
		System.out.printf("합계: %d\n평균: %.2f", sum, mean);
		*/
		
//		5-6: int형 변수에 실수값을 대입해서 표시하는 프로그램.
		/*
		int num = 0;
		num = (int)1.234;
		System.out.println(num);
		*/
		
//		5-8: float 형의 변ㅅ를 0.0부터 1.0까지 0.001씩 증가시키며 표시하고,
//		그 옆의 int형 변수를 0부터 1000까지 1ㅆ힉 증가시키며 1000으로 나눈 값을 (실수로)표시하시오
//		(소수점 이하 7자리까지 표시하세요.)
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
