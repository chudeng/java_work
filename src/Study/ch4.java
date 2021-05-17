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
		
		//4-13: 입력받은 양의정수값까지 0부터 카운트 업.
		/*
		int num = 0;
		do {
			System.out.print("양의정수 값 입력:");
			num = sc.nextInt();
		}while (num < 0);{
		}
		System.out.println("카운트를 시작합니다.");
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
			
		}*/
		
		//4-14: 1부터 n까지의 합을 구하는 프로그램을 작성하시오.(for문)
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("양의정수 값 입력:");
			num = sc.nextInt();
		} while (num < 0);{
			
		}
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.print(num + "까지의 합:" + sum);
		*/
		
		//4-15: 4-14 프로그램을 수정해서 결과뿐만 아니라 계산식까지 표시하는 프로그램을 작성하시오.
		/*int num = 0;
		int sum = 0;
		do {
			System.out.print("양의정수 값 입력:");
			num = sc.nextInt();
		} while (num < 0);{
			
		}
		
		System.out.print(num + "까지의 합:");
		
		for (int i = 1; i < num; i++) {
			sum = sum + i;
			System.out.print(i + "+");
		}
		System.out.print(num + "=" + (sum + num));
		*/
		
		//4-16: 신장별 표준 체중 대응표를 표시하는 프로그램을 작성.
		//표준 체중 = (신장 - 100) * 0.9
		//표시할 신장의 범위(최소/최대/증가값)는 정수값으로 입력 받을 것.
		/*System.out.println("신장별 표준 체중 대응표");
		System.out.print("신장 최대값: ");
		int max = sc.nextInt();
		System.out.print("신장 최소값: ");
		int min = sc.nextInt();
		System.out.print("신장 증가값: ");
		int increasment = sc.nextInt();
		System.out.println("범주-->(최소값: " + min + " 최대값: " + max + " 증감값: " + increasment + ")\n\t신장\t|\t표준체중\n------------------------------------");
		
		for (; min <= max; min = min + increasment) {
			double standard = 0;
			standard = (min - 100) * 0.9;
			System.out.println("\t" + min + "\t|\t" + standard);
		}*/
		
		//4-17: 입력한 수만틈 '*'을 표시하는 문제를 변경해서 5개 단위로 줄바꿈해서 표시.
		/*
		int num = 0;
		System.out.print("출력할 별의 갯수: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int remainder = i%5;
			System.out.print("*");
			if (i >= 5 && remainder == 0) {
				System.out.print("\n");
			}
		}
		*/
		
		//4-18: 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램
		/*
		int aliquot = 0;
		int num = 0;
		do {
			System.out.print("정수 입력:");
			num = sc.nextInt();
		}while(num <= 0);
		
		System.out.print(num + "의 약수 및 개수\n약수:");
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				System.out.print(i + " ");
				aliquot ++;
			}
		}
		System.out.println("\t개수: " + aliquot);
		*/
		
		//4-19: 1부터 n까지의 정수값에 각 값을 제곱해서 표시하는 프로그램을 작성하시오.
		/*
		int num = 0;
		do {
			System.out.print("정수 입력:");
			num = sc.nextInt();
		}while(num <= 0);
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "의 제곱은 " + (i * i) + " 입니다.");
		}
		*/
		
		//4-20: 달(월)을 정수값으로 입력받아서 해당하는 달의 계절을 표시하는 프로그램을 작성하시오.
		//원하는 만큼 입력 및 출력할 수 있게 하고, 1~12 이외의 값이 입력되는 경우, 재입력 되도록 할 것.
		/*
		int num = 0;
		int Continue = 0;
		do {
			System.out.print("정수 입력:");
			num = sc.nextInt();
			if(num >= 1 && num <= 12) {
				if(num == 12 || num == 1 || num == 2) {
					System.out.println(num + "월은 겨울입니다.");
				} else if(num == 3 || num == 4 || num == 5) {
					System.out.println(num + "월은 봄입니다.");
				} else if(num == 6 || num == 7 || num == 8) {
					System.out.println(num + "월은 여름입니다.");
				} else{
					System.out.println(num + "월은 가을입니다.");
				}
				do {
					System.out.print("다시 입력 하시겠습니까? (Yes: 1, No: 0): ");
					Continue = sc.nextInt();
				} while (Continue != 1 && Continue != 0);
			}	
		} while(num < 1 || num > 12 || Continue == 1);
		*/
		
		//4-21: 기호 문자 '*'을 나열해서 n단의 정방형(정사각형을)표시하는 프로그램을 작성하시오.
		/*
		int num = 0;
		do {
			System.out.print("정사각형 크기 입력(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		//4-21**: 기호 문자 '*'을 나열해서 3x5 직사각형을 표시하는 프로그램을 작성하시오.
		/*
		int num = 0;
		do {
			System.out.print("직사각형 층 입력(1 = *): ");
			num = sc.nextInt();
		}while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		//4-22: "*"을 나열해서 직각 삼각형을 표시하는 프로그램을 작성하시오
		//- 직각의치가 왼쪽 아래 하나, 왼쪽 위 하나 각각 표시되게
		/*
		int num = 0;
		do {
			System.out.print("직사각형 층 입력(1 = *): ");
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
		
		//4-23:"*"로 n층의 이등변삼각형을 표시하는 프로그램을 작성하세요.
		/*
		int num = 0;
		do {
			System.out.print("정삼각형 층 입력(1 = *): ");
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
		
		//4-24: n단의 숫자 피라미드를 표시하는 프로그램을 작성하세요.
		// 두자리수까지만 고려하며, 2자리수는 1의 자리 숫자로 표시.
		/*
		int num = 0;
		do {
			System.out.print("정삼각형 층 입력: ");
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
		
		//4-25: 양의 정수랎을 입력받아서 인지 판정하는 프로그램을 작성하시오.
		//란 2이상 n미만인 수 중 어던 수로도 나누어지지 않는 정수값 n이다.
//		(즉, 1과 자기 자신으로만 나누어 떨어지는 수)
		/*
		int num = 0;
		do {
			System.out.print("2 이상의 양의 정수값을 입력하세요: ");
			num = sc.nextInt();
		}while (num <= 1);
		
		for (int i = 2; i <= num; i++) {
			if (num == i) {
				System.out.println(num + "은(는) 소수 입니다.");
			} else if (num%i == 0) {
				System.out.println(num + "은(는) 소수가 아닙니다.");
				break;
			}
		}
		*/
		
		//4-26: 정수값을 연속해 입력받아 합계와 평균을 구하는 프로그램을 작성하시오.
//		(0 입력 받으면 프로그램 종료)
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("몇개의 정수를 입력 할까요? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		int[] inputNum = new int[num];
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요(종료:0): ");
			inputNum[i] = sc.nextInt();
			if (inputNum[i] == 0) {
				System.out.println("종료합니다.");
				break;
			}
			sum = sum + inputNum[i];
		}

		System.out.println("입력한 수의 합: " + sum);
		System.out.println("입력한 수의 평균: " + (sum/(double)num));
		*/
		
//		4-27: 정수값을 입력받아 합계와 평균을 구하는 프로그램을 작성하시오.(for 문 사용)
//		정수값의 입력은 합계가 1000을 넘지 않는 범위에서 이루어지도록 하세요.
		/*
		int num = 0;
		int sum = 0;
		do {
			System.out.print("몇개의 정수를 입력 할까요? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		int[] inputNum = new int[num];
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요(종료:0): ");
			inputNum[i] = sc.nextInt();
			if (inputNum[i] == 0) {
				System.out.println("종료합니다.");
				break;
			} else if ((sum + inputNum[i]) > 1000) {
				System.out.println("합계가 1000을 넘었습니다. 마지막 값을 무시한 나머지 입력갑의 합과 평균을 표시 합니다.");
				System.out.println("입력한 수의 합: " + sum);
				System.out.println("입력한 수의 평균: " + (sum/(double)num));
				break;
			} else {
				sum = sum + inputNum[i];
			}
		}
		*/
		
//		4-28: 정수값을 입력받고, 입력받은 수에서 음수를 제외한 나머지 수의 합과 평균을 구하는 프로그램을 작성하시오.(for 문)
		int num = 0;
		int sum = 0;
		int countPositive = 0;
		int countNegative = 0;
		do {
			System.out.print("몇개의 정수를 입력 할까요? ");
			num = sc.nextInt();
		}while (num <= 0);
		
		for (int i = 0; i <num; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요(종료:0): ");
			int inputNum = sc.nextInt();
			if (inputNum == 0) {
				System.out.println("종료합니다.");
				break;
			} else if ( inputNum < 0) {
				countNegative = countNegative + 1;
				continue;
			} else {
				countPositive = countPositive + 1;
				sum = sum + inputNum;
			}
		}
		System.out.println("입력한 수의 합: " + sum);
		System.out.println("입력한 수의 평균: " + (sum/(double)countPositive));
	}
	
}
