public class EarlyInstantiationSingleton {

    // Step 1: Create a private static member to hold the single instance of the class.
    private static final EarlyInstantiationSingleton instance = new EarlyInstantiationSingleton();

    // Step 2: Private constructor to prevent external instantiation.
    private EarlyInstantiationSingleton() {
        // Initialization code, if needed.
    }

    // Step 3: Static factory method to provide access to the single instance.
    public static EarlyInstantiationSingleton getInstance() {
        return instance;
    }

    // Other methods and data members of the singleton class can be defined here.

    // Example method:
    public void showMessage() {
        System.out.println("Hello, I am an Early Instantiation Singleton!");
    }



}
