public class Logger {
    // Step 1: Create a private static instance of the class
    private static Logger instance;

    // Step 2: Make the constructor private
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // lazy initialization
        }
        return instance;
    }

    // Utility method to log messages
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}