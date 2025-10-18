package design;
import design.abstract_factory.AbstractFactoryTest;
import design.singleton.DatabaseConnectionTest;
public class Main {
    public static void main(String[] args) {
        DatabaseConnectionTest databaseConnectionTest = new DatabaseConnectionTest();
        if(!databaseConnectionTest.test()) {
            System.err.println("Singleton test failed");
        }

        AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest();
        if(!abstractFactoryTest.test()) {
            System.err.println("Abstract factory test failed");
        }
        System.out.println("Done!!!");
    }
}
