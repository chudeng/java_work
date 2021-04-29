package Study;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		//double dnum1 = sc.nextDouble();
		//double dnum2 = sc.nextDouble();
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
		/*if (num1<0 || num1>100) {
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
		}*/
		
		//3-12
		/*if (dnum1 > dnum2) {
			System.out.println(dnum1);
		} else {
			System.out.println(dnum2);
		}*/
		
		//3-13 ?? 나중에 다시 해보삼~
		/*int diff = num1 - num2;
		System.out.println(Math.abs(diff));*/
		
		//3-14
		/*int diff = num1 - num2;
		if (Math.abs(diff) > 10) {
			System.out.println("두 값의 차는 11 이상");
		} else {
			System.out.println("두 값의 차는 10 이하1");
		}*/
		
		//3-15
		/*if (num1 > num2) {
			if (num2 > num3) {
				System.out.println("최소값: " + num3);
			} else {
				System.out.println("최소값: " + num2);
			}
		}else {
			if (num1 > num3) {
				System.out.println("최소값: " + num3);
			}else {
				System.out.println("최소값: " + num1);
			}
		}*/
		
		//3-16
		/*if (num1 > num2) {
			if (num2 > num3) {
				System.out.println("중앙값: " + num2);
			}else if (num2 < num3) {
				if(num3 > num1) {
					System.out.println("중앙값: " + num1);
				}else {
					System.out.println("중앙값: " + num3);
				}
			}else {
				System.out.println("중앙값: " + num2);
			}
		}else if (num1 < num2) {
			if (num1 > num3) {
				System.out.println("중앙값: " + num1);
			}else if (num1 < num3) {
				if (num2 > num3) {
					System.out.println("중앙값: " + num3);
				}else {
					System.out.println("중앙값: " + num2);
				}
			}else {
				System.out.println("중앙값: " + num1);
			}
		}else {
			System.out.println("중앙값: " + num1);
		}*/
		
		//3-17
		/*if (num1 == num2) {
			System.out.println("두 값은 같습니다.");
		}else {
			if (num1 > num2) {
				System.out.println("큰값 = " + num1 + "\n작은값 = " + num2);
			}else {
				System.out.println("큰값 = " + num2 + "\n작은값 = " + num1);
			}
		}*/
		
		//3-18
		/*int stk;
		if (num1 >= num2) {
			System.out.println("no chages");
		}else {
			stk = num1;
			num1 = num2;
			num2 = stk;
			System.out.println("num1 and num2 are changed");
		}*/
		
		//3-19
		/*int stk;
		
		if (num1 >= num2) {
			stk = num1;
			num1 = num2;
			num2 = stk;
		}
		if (num2 >= num3) {
			stk = num2;
			num2 = num3;
			num3 = stk;
		}
		if (num1 >= num2) {
			stk = num1;
			num1 = num2;
			num2 = stk;
		}
		
		System.out.println(num1 + "," + num2 + "," + num3);*/
		
		sc.close();

	}

}
