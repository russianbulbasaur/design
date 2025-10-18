package design.abstract_factory;

import java.util.List;

public class X86 implements Architecture {

    @Override
    public List<String> getInstructionList() {
        return List.of("add","sub","mul","mov");
    }

    @Override
    public String getArchitectureName() {
        return "x86";
    }

    @Override
    public ArchitectureType getArchitectureType() {
        return ArchitectureType.CISC;
    }
}
