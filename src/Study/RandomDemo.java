package Study;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int input = sc.nextInt();
		Random random = new Random();
		int rand1to9 = random.nextInt(input + 5)+(input - 5);
		int rand9to1nag = (random.nextInt(9)+1)* (-1);
		int rand10to99 = random.nextInt(90)+10;
		System.out.println("1 ~ 9 Random: " + rand1to9);
		System.out.println("-9 ~ -1 Random: " + rand9to1nag);
		System.out.println("10 ~ 99 Random: " + rand10to99);

	}

}
