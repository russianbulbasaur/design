package design.singleton;


public class DatabaseConnectionTest {
    public boolean test(){
        DatabaseConnection connection = DatabaseConnection.getInstance();
        return (DatabaseConnection.getInstance().hashCode() == connection.hashCode());
    }
}