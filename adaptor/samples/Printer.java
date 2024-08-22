package adaptor.samples;

public interface Printable {
    void print();
}

public class Document implements Printable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

public class Printer {
    private Printable printable;

    public void setPrintable(Printable printable) {
        this.printable = printable;
    }

    public void printDocument() {
        printable.print();
    }
}

public class PrinterAdapter implements Printable {
    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print() {
        oldPrinter.printDocument();
    }
}

public class OldPrinter {
    public void printDocument() {
        System.out.println("Printing document using old printer");
    }
}