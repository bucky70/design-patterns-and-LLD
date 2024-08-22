package practice_area.prototype;

public class Laptop {
    private int ram;
    private int memory;
    private String processor;
    public Laptop(int ram, int memory, String processsor){
        this.ram=ram;
        this.memory=memory;
        this.processor=processsor;
    }
    
    public Laptop(Laptop laptop) {
        this.ram=laptop.ram;
        this.memory=laptop.memory;
        this.processor=laptop.processor;
    }

    public Laptop getClone(){
        return new Laptop(this);
    }
}
