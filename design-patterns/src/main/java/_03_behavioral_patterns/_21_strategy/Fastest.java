package _03_behavioral_patterns._21_strategy;

public class Fastest implements Speed {
    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void RedLight() {
        System.out.println("피었슴다.");
    }
}

