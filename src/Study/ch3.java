package Study;

import java.util.Scanner;
import java.util.Random;

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
			System.out.println("占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쌉니댐옙.");
		}
		if (num > 0) {
			System.out.println("占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쌉니댐옙.");
		}*/
		
		//3-2
		/*if (num < 0) {
			System.out.println(num + "占쏙옙 占쏙옙占쎈값: " + (num * (-1)));
		}
		if (num > 0) {
			System.out.println(num + "占쏙옙 占쏙옙占쎈값: " + num);
		}
		System.out.println(num + "占쏙옙 占쏙옙占쎈값: " + Math.abs(num));*/
		
		//3-3
		/*if (num1%num2 == 0) {
			System.out.println(num2 + "占쏙옙 " + num1 + "占쏙옙 占쏙옙占쏙옙甄占�.");
		} else {
			System.out.println(num2 + "占쏙옙 " + num1 + "占쏙옙 占쏙옙占쏙옙占� 占싣니댐옙.");
		}*/
		
		//3-5
		/*if (num1 < 0) {
			System.out.println("占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쌉니댐옙.");
		} else if (num1 == 0) {
			System.out.println("占쏙옙 占쏙옙占쏙옙 0 占쌉니댐옙.");
		} else {
			System.out.println("占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쌉니댐옙.");
		} */
		
		//3-7
		/*if (num1 < num2) {
			System.out.println(num1 + "占쏙옙 크占쏙옙.");
		} else if (num1 == num2) {
			System.out.println(num1 + "占쏙옙 " + num2 + "占쏙옙 占쏙옙占쏙옙.");
		} else {
			System.out.println(num1 + "占쏙옙 占쌜댐옙.");
		} */
		
		//3-8
		/*if (num1 < 0) {
			System.out.println("占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쌉뤄옙 占쌩쏙옙占싹댐옙.");
		} else if (num1%5 == 0) {
			System.out.println("5占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占싹댐옙.");
		} else {
			System.out.println("5占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占십쏙옙占싹댐옙.");
		}*/
		
		//3-9
		/*if (num1%10 == 0) {
			System.out.println("10占쏙옙 占쏙옙占� 占쌉니댐옙.");
		} else {
			System.out.println("10占쏙옙 占쏙옙占쏙옙占� 占싣닙니댐옙.");
		}*/
		
		//3-10
		/*if (num1 < 0) {
			System.out.println("占쏙옙占쏙옙占� 占싣댐옙 占쏙옙占쏙옙 占쌉뤄옙 占쌩쏙옙占싹댐옙.");
		} else {
			System.out.println("占쏙옙 占쏙옙占쏙옙 3占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占싹댐옙.");
			switch (num1%3) {
			case 1:
				System.out.println("占쏙옙 占쏙옙占쏙옙 3占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 1占쌉니댐옙.");
			case 2:
				System.out.println("占쏙옙 占쏙옙占쏙옙 3占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 2占쌉니댐옙.");
			}
		}*/
		
		//3-11
		/*if (num1<0 || num1>100) {
			System.out.println("占쌩몌옙占쏙옙 占쏙옙占쏙옙 占쌉니댐옙.");
		}else {
			if (num1 >= 80) {
				System.out.println("占쏙옙");
			}else if (num1 >= 70) {
				System.out.println("占쏙옙");
			}else if (num1 >= 60) {
				System.out.println("占쏙옙");
			}else if (num1 >= 50) {
				System.out.println("占쏙옙");
			}else {
				System.out.println("占쏙옙");
			}	
		}*/
		
		//3-12
		/*if (dnum1 > dnum2) {
			System.out.println(dnum1);
		} else {
			System.out.println(dnum2);
		}*/
		
		//3-13 ?? �굹以묒뿉 �떎�떆 �빐蹂댁궪~
		/*int diff = num1 - num2;
		System.out.println(Math.abs(diff));*/
		
		//3-14
		/*int diff = num1 - num2;
		if (Math.abs(diff) > 10) {
			System.out.println("�몢 媛믪쓽 李⑤뒗 11 �씠�긽");
		} else {
			System.out.println("�몢 媛믪쓽 李⑤뒗 10 �씠�븯1");
		}*/
		
		//3-15
		/*if (num1 > num2) {
			if (num2 > num3) {
				System.out.println("理쒖냼媛�: " + num3);
			} else {
				System.out.println("理쒖냼媛�: " + num2);
			}
		}else {
			if (num1 > num3) {
				System.out.println("理쒖냼媛�: " + num3);
			}else {
				System.out.println("理쒖냼媛�: " + num1);
			}
		}*/
		
		//3-16
		/*if (num1 > num2) {
			if (num2 > num3) {
				System.out.println("以묒븰媛�: " + num2);
			}else if (num2 < num3) {
				if(num3 > num1) {
					System.out.println("以묒븰媛�: " + num1);
				}else {
					System.out.println("以묒븰媛�: " + num3);
				}
			}else {
				System.out.println("以묒븰媛�: " + num2);
			}
		}else if (num1 < num2) {
			if (num1 > num3) {
				System.out.println("以묒븰媛�: " + num1);
			}else if (num1 < num3) {
				if (num2 > num3) {
					System.out.println("以묒븰媛�: " + num3);
				}else {
					System.out.println("以묒븰媛�: " + num2);
				}
			}else {
				System.out.println("以묒븰媛�: " + num1);
			}
		}else {
			System.out.println("以묒븰媛�: " + num1);
		}*/
		
		//3-17
		/*if (num1 == num2) {
			System.out.println("�몢 媛믪� 媛숈뒿�땲�떎.");
		}else {
			if (num1 > num2) {
				System.out.println("�겙媛� = " + num1 + "\n�옉��媛� = " + num2);
			}else {
				System.out.println("�겙媛� = " + num2 + "\n�옉��媛� = " + num1);
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
		
		//3-20
		/*Random rand = new Random();
		int randnum1 = rand.nextInt(3);
		if (randnum1 == 0) {
			System.out.println("가위");
		}else if (randnum1 == 1) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		
		switch(randnum1+1) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		}*/
		
		//3-21
		System.out.println("월을 입력하세요:");
		int month = sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("1월");
			break;
		case 2:
			System.out.println("2월");
			break;
		case 3:
			System.out.println("3월");
			break;
		case 4:
			System.out.println("4월");
			break;
		case 5:
			System.out.println("5월");
			break;
		case 6:
			System.out.println("6월");
			break;
		case 7:
			System.out.println("7월");
			break;
		case 8:
			System.out.println("8월");
			break;
		case 9:
			System.out.println("9월");
			break;
		case 10:
			System.out.println("10월");
			break;
		case 11:
			System.out.println("11월");
			break;
		case 12:
			System.out.println("12월");
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다.");
		}
		sc.close();
	}

}
