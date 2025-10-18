package design.abstract_factory;

import java.util.List;

public class Arm implements Architecture {
    @Override
    public List<String> getInstructionList() {
        return List.of("cpy","div","sow");
    }

    @Override
    public String getArchitectureName() {
        return "arm";
    }

    @Override
    public ArchitectureType getArchitectureType() {
        return ArchitectureType.RISC;
    }
}
