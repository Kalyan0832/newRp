package pavan;

public interface PractInterface {

	public static void main(String[] args) {
		System.out.println("hai");
	}
	
	
	default void m1() {
		System.out.println("byee");
	}

	
}

