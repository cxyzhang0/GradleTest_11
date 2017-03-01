package design.pattern.singleton;

/**
 * Created by Sean on 2/24/2017.
 */
public class AutoCreatedSingleton {
    private static AutoCreatedSingleton ourInstance = new AutoCreatedSingleton();

    public static AutoCreatedSingleton getInstance() {
        return ourInstance;
    }

    private AutoCreatedSingleton() {
    }
}
