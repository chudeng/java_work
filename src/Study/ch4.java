package Study;

import java.util.Scanner;

public class ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
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
		while(true) {
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
		}
	}
}
