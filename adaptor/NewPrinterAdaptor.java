package adaptor;

public class NewPrinterAdaptor implements NewPrinterInterface{
    OldPrinter oldPrinter;
    public NewPrinterAdaptor(OldPrinter oldPrinter){
        this.oldPrinter=oldPrinter;
    }
    @Override
    public void print(){
        oldPrinter.print();
    }
    @Override
    public void colorPrint(){
        System.out.println("printing color print");
    }
}
