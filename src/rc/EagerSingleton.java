package rc;

public class EagerSingleton {
    // eager
    private static EagerSingleton instance = new EagerSingleton();

    static int a = 1;

    // private ctor
    private EagerSingleton(){

    }

    // retrieve instance
    public static EagerSingleton instance(){
        return instance;
    }
}
