package accessmodifier;

class A {
	public String y() {
		return "public boid y()";
	}
	
	private String z() {
		return "public boid z()";
	}
	
	public String x() {
		return z();
	}
}
public class AccessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		System.out.println(a.y());
		//System.out.println(a.z());
		System.out.println(a.x());

	}

}
