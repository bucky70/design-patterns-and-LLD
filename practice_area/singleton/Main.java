package practice_area.singleton;

public class Main {
    public static void main(String args[]){
        BillPughSingleton example1=BillPughSingleton.getInstance();
        BillPughSingleton example2=BillPughSingleton.getInstance();

        System.out.println(example1);
        System.out.println(example2);

    }
}
