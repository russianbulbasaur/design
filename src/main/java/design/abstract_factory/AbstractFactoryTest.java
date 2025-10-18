package design.abstract_factory;

import java.util.List;

public class AbstractFactoryTest {
    public boolean test(){
        boolean result;
        X86Factory x86Factory = new X86Factory();
        ArmFactory armFactory = new ArmFactory();
        Architecture architecture = x86Factory.newArchitecture();
        result = architecture.getArchitectureName().equals("x86");
        result = result && (architecture.getInstructionList().equals(List.of("add","sub","mul","mov")));

        architecture = armFactory.newArchitecture();
        result = result && architecture.getArchitectureName().equals("arm");
        result = result && (architecture.getInstructionList().equals(List.of("cpy","div","sow")));
        return result;
    }
}
