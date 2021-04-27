package Study;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double i = s.nextDouble();
		final double PI = 3.1416;
		System.out.println("구의 겉넓이= " + (4*PI*(Math.pow(i, 2))));
		System.out.println("구의 부피= " + (4/3*PI*(Math.pow(i, 3))));
		s.close();

	}

}
