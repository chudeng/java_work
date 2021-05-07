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
			System.out.println("원하는 정수값을 입력 하세요(종료: 0)");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (num > 0) {
				System.out.println("입력하신 값은 양수 입니다.");
			} else {
				System.out.println("입력하신 값은 음수 입니다.");
			} 
		}*/
		
		/*int num = 0;
		do {
			System.out.println("원하는 정수값을 입력 하세요(종료: 0)");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("입력하신 값은 양수 입니다.");
			} else {
				System.out.println("입력하신 값은 음수 입니다.");
			} 
		} while(num != 0);
		
		System.out.println("종료합니다.");*/
		
		//4-2
		/*while(true) {
			System.out.println("3자리 양의 정수값을 입력하세요.");
			int num = sc.nextInt();
			if (num  < 100) {
				System.out.println("3자리 양의 정수를 만족하지 않습니다.");
			} else if(num > 999) {
				System.out.println("3자리 양의 정수를 만족하지 않습니다.");	
			} else {
				System.out.println("입력한 수: " + num);
				break;
			}
		}*/
		
		//4-3
		/*int Qnum = rand.nextInt(90)+10;
		int answer = 0;
		do {
			System.out.println("2자리 숫자를 입력하세요:");
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
				System.out.println("종료 후 변수 값:" + (num-1));
			}
		} else if (num < 0) {
			do {
				System.out.println(num);
				num ++;
			} while(num != 0); {
				System.out.println(num);
				System.out.println("종료 후 변수 값:" + (num+1));
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
