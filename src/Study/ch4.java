package Study;

import java.util.Scanner;

public class ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
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
		while(true) {
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
		}
	}
}
