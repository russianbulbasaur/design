package design.abstract_factory;

public class ArmFactory implements ArchitectureFactoryInterface{
    @Override
    public Architecture newArchitecture() {
        return new Arm();
    }
}
