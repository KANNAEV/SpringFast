package part5_Scopes.ex_01_SingleToneAndSingleScope;


public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void printDB() {
        System.out.println("Hello");
    }
}


