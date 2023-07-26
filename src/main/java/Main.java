public class Main {
    public static void main(String[] args) {

        EarlyInstantiationSingleton instance = EarlyInstantiationSingleton.getInstance();
        instance.showMessage();

        LazyInstantiationSingleton singleton = LazyInstantiationSingleton.getInstance();
        singleton.showMessage();
    }
}
