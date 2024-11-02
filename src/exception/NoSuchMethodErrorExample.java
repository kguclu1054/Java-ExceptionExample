package exception;


public class NoSuchMethodErrorExample {

	public static void main(String[] args) {

		try {
			MyClass obj = new MyClass();
			throw new NoSuchMethodError("someNonExistentField");
		} catch(NoSuchMethodError e) {
			 System.out.println("NoSuchMethodError yakalandı: " + e.getMessage());
		}
	}

	static class MyClass{
		
	}
}
