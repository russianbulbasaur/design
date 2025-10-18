package design.singleton;

public class DatabaseConnection {

    private DatabaseConnection(){}
    // singleton connection
    private static DatabaseConnection connection;

    public static DatabaseConnection getInstance() {
        if(connection==null){
            connection = new DatabaseConnection();
        }
        return connection;
    }
}


