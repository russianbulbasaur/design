package design.builder;

public class LaptopBuilder {
    private Display display;
    private CPU cpu;
    private RAM ram;
    private SSD ssd;


    LaptopBuilder addCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }


    LaptopBuilder addDisplay(Display d) {
        this.display = d;
        return this;
    }

    LaptopBuilder addRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    LaptopBuilder addSSD(SSD ssd) {
        this.ssd = ssd;
        return this;
    }

    public Laptop build() {
        return new Laptop(display,cpu,ram,ssd);
    }
}
