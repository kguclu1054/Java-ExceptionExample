package exception;

public class NoClassDefFoundErrorExample {
    public static void main(String[] args) {
        try {
            
            throwNoClassDefFoundError();
        } catch (NoClassDefFoundError e) {
            System.out.println("NoClassDefFoundError yakalandı: " + e.getMessage());
        }
    }

    private static void throwNoClassDefFoundError() {
        throw new NoClassDefFoundError("Simüle edilmiş hata: ClassThatDoesNotExist");
    }
}


