package Inheritance.example1;

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class MultipleicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleicationableCalculator c1 = new MultipleicationableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();

	}

}
