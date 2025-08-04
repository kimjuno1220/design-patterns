package main.java.me.whiteship.designpatterns._01_creational_patterns._01_singleton;
//Double Checked Locking
public class Settings_DCL {

    private static Settings_DCL instance;

    private Settings_DCL() {}

    public static Settings_DCL getInstance() {
        if (instance == null) {
            synchronized (Settings_DCL.class) {
                if (instance == null) {
                    instance = new Settings_DCL();
                }
            }
        }

        return instance;
    }

}
