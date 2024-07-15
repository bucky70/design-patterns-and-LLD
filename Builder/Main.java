package Builder;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", 32)
                .withGPU("NVIDIA RTX 3080")
                .withStorage(2000)
                .withDisplay("4K Ultra HD")
                .build();

        Computer officePC = new Computer.Builder("Intel i5", 16)
                .withStorage(512)
                .withDisplay("Full HD")
                .build();

        Computer budgetPC = new Computer.Builder("AMD Ryzen 3", 8)
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(budgetPC);
    }
}
