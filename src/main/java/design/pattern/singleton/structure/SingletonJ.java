package design.pattern.singleton.structure;

/**
 * Created by Sean on 2/26/2017.
 */
public class SingletonJ {
    private static SingletonJ ourInstance = new SingletonJ();

    public static SingletonJ getInstance() {
        return ourInstance;
    }

    private SingletonJ() {
    }
}
