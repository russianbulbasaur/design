package design.builder;

public class LaptopTest {
    public boolean test() {
        Laptop laptop = (new LaptopBuilder())
                .addCPU(CPU.intel)
                .addRAM(RAM.gb16)
                .addSSD(SSD.consistent)
                .addDisplay(Display.oLed)
                .build();
        return laptop.compute();
    }
}
