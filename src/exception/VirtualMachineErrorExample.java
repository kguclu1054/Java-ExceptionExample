package exception;
public class VirtualMachineErrorExample {
    public static void main(String[] args) {
        // VirtualMachineError Örneği
        try {
            throwVirtualMachineError();
        } catch (VirtualMachineError e) {
            System.out.println("VirtualMachineError yakalandı: " + e.getMessage());
        }

        // OutOfMemoryError Örneği
        try {
            throwOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError yakalandı: " + e.getMessage());
        }

        // StackOverflowError Örneği
        try {
            throwStackOverflowError();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError yakalandı: " + e.getMessage());
        }
    }

    private static void throwVirtualMachineError() {
        throw new VirtualMachineError("Simüle edilmiş hata: Sanal Makine Hatası!") {};
    }

    private static void throwOutOfMemoryError() {
        int[] largeArray = new int[Integer.MAX_VALUE]; // Çok büyük bir dizi oluşturmak, bellek hatasına neden olur
    }

    private static void throwStackOverflowError() {
        recursiveMethod(); // Sonsuz döngü ile stack overflow hatası fırlatmak
    }

    private static void recursiveMethod() {
        recursiveMethod(); // Sonsuz döngü
    }
}

