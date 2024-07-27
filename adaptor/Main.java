package adaptor;

public class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        NewPrinterInterface newPrinter = new NewPrinterAdaptor(oldPrinter);

        newPrinter.colorPrint(); 
        newPrinter.print(); // Uses the adapter
    }
}
