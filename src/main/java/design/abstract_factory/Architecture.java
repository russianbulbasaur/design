package design.abstract_factory;

import java.util.*;

public interface Architecture {
    List<String> getInstructionList();
    String getArchitectureName();
    ArchitectureType getArchitectureType();
}
