package abstractclass.example1;

abstract class A {
	public abstract int b();
	
	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}

}
