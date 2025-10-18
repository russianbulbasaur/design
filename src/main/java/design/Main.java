package design;
import design.abstract_factory.AbstractFactoryTest;
import design.singleton.DatabaseConnectionTest;
public class Main {
    static void main() {
        DatabaseConnectionTest databaseConnectionTest = new DatabaseConnectionTest();
        if(!databaseConnectionTest.test()) {
            System.err.println("Singleton test failed");
        }

        AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest();
        if(!abstractFactoryTest.test()) {
            System.err.println("Abstract factory test failed");
        }
    }
}
