package _03_behavioral_patterns._21_strategy;

public class BlueLightRedLight {
    // 첫번째 방법
//    private Speed speed;
//
//    public BlueLightRedLight(Speed speed) {
//        this.speed = speed;
//    }
//
//    public void blueLight() {
//        speed.blueLight();
//    }
//
//    public void redLight() {
//        speed.RedLight();
//    }
    // 두번째 방법
    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.RedLight();
    }
}
