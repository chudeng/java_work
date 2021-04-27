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
			System.out.println("이 값은 음의 값입니다.");
		}
		if (num > 0) {
			System.out.println("이 값은 양의 값입니다.");
		}*/
		
		//3-2
		/*if (num < 0) {
			System.out.println(num + "의 절대값: " + (num * (-1)));
		}
		if (num > 0) {
			System.out.println(num + "의 절대값: " + num);
		}
		System.out.println(num + "의 절대값: " + Math.abs(num));*/
		
		//3-3
		/*if (num1%num2 == 0) {
			System.out.println(num2 + "는 " + num1 + "의 약수이다.");
		} else {
			System.out.println(num2 + "는 " + num1 + "의 약수가 아니다.");
		}*/
		
		//3-5
		/*if (num1 < 0) {
			System.out.println("이 값은 음의 값입니다.");
		} else if (num1 == 0) {
			System.out.println("이 값은 0 입니다.");
		} else {
			System.out.println("이 값은 양의 값입니다.");
		} */
		
		//3-7
		/*if (num1 < num2) {
			System.out.println(num1 + "이 크다.");
		} else if (num1 == num2) {
			System.out.println(num1 + "과 " + num2 + "가 같다.");
		} else {
			System.out.println(num1 + "이 작다.");
		} */
		
		//3-8
		/*if (num1 < 0) {
			System.out.println("음의 정수값을 입력 했습니다.");
		} else if (num1%5 == 0) {
			System.out.println("5로 나누어 떨어집니다.");
		} else {
			System.out.println("5로 나누어 떨어지지 않습니다.");
		}*/
		
		//3-9
		/*if (num1%10 == 0) {
			System.out.println("10의 배수 입니다.");
		} else {
			System.out.println("10의 배수가 아닙니다.");
		}*/
		
		//3-10
		/*if (num1 < 0) {
			System.out.println("양수가 아닌 값을 입력 했습니다.");
		} else {
			System.out.println("이 값은 3으로 나누어 집니다.");
			switch (num1%3) {
			case 1:
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			case 2:
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}
		}*/
		
		//3-11
		if (num1<0 || num1>100) {
			System.out.println("잘못된 점수 입니다.");
		}else {
			if (num1 >= 80) {
				System.out.println("수");
			}else if (num1 >= 70) {
				System.out.println("우");
			}else if (num1 >= 60) {
				System.out.println("미");
			}else if (num1 >= 50) {
				System.out.println("양");
			}else {
				System.out.println("가");
			}	
		}
		
		
		sc.close();

	}

}
