package pavan;

public class B extends A {

	int a = 30;
	static int b = 500;

	public static void main(String[] args) {

		A obj = new B();

		System.out.println(obj.a);

	}
	public void m1() {
		
		System.out.println("from B");
	
	}

}
