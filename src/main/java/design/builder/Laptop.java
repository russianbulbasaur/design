package design.builder;

public class Laptop {
    private final Display display;
    private final CPU cpu;
    private final RAM ram;
    private final SSD ssd;

    Laptop(Display display1,CPU cpu1,RAM ram1,SSD ssd1){
        this.cpu = cpu1;
        this.display = display1;
        this.ram = ram1;
        this.ssd = ssd1;
    }


    public boolean compute() {
        System.out.printf("%s,%s,%s,%s\n",display,cpu,ram,ssd);
        return true;
    }
}
