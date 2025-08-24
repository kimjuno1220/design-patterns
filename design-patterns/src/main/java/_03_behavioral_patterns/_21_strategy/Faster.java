package _03_behavioral_patterns._21_strategy;

public class Faster implements Speed {
    @Override
    public void blueLight() {
        System.out.println("무궁화꽃이");
    }

    @Override
    public void RedLight() {
        System.out.println("피었습니다.");
    }
}
