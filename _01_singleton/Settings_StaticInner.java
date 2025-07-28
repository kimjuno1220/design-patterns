package main.java.me.wihteship.designpatterns._01_singleton;

public class Settings_StaticInner {

    private Settings_StaticInner() {}

    private static class SettingsHolder {
        private static final Settings_StaticInner INSTANCE = new Settings_StaticInner();
    }

    public static Settings_StaticInner getInstance() {
        return SettingsHolder.INSTANCE;
    }

}
