package object;

class Calculator1 {
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
	
class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);

		System.out.println(Calculator1.PI);
		
	}

}
