package exception;
public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            MyClass obj = new MyClass();
            throw new NoSuchFieldError("someNonExistentField");
        } catch (NoSuchFieldError e) {
            System.out.println("NoSuchFieldError yakalandı: " + e.getMessage());
        }
    }

    static class MyClass {
        // Bu sınıfta 'someNonExistentField' adında bir alan yok
    }
}


