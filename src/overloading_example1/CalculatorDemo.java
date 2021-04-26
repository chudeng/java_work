package overloading_example1;

class Calculator{
	int left, right, third;
	
	public void setOperands(int left, int right) {
		System.out.print("setOperands(int left, int right)\n");
		this.left = left;
		this.right = right;
	}
	
	public void setOperands(int left, int right, int third) {
		System.out.print("setOperands(int left, int right, int third)\n");
		this.setOperands(left, right);
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + this.third)/3);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}
