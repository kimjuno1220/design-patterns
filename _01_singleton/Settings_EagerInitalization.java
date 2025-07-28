package main.java.me.wihteship.designpatterns._01_singleton;

public class Settings_EagerInitalization {

    private static Settings_EagerInitalization INSTANCE = new Settings_EagerInitalization();

    private Settings_EagerInitalization() {}

    public static synchronized Settings_EagerInitalization getInstance() {
                return INSTANCE;
    }

}
