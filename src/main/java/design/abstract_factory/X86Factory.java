package design.abstract_factory;

public class X86Factory implements ArchitectureFactoryInterface{
    @Override
    public Architecture newArchitecture() {
        return new X86();
    }
}
