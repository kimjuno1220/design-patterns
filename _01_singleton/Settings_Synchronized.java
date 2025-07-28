package main.java.me.wihteship.designpatterns._01_singleton;

public class Settings_Synchronized {

    private static Settings_Synchronized instance;

    private Settings_Synchronized() {}

    public static synchronized Settings_Synchronized getInstance() {
        if (instance == null) {
            instance = new Settings_Synchronized();
        }

        return instance;
    }

}
