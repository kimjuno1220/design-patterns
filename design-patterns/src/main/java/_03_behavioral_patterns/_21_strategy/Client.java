package _03_behavioral_patterns._21_strategy;

public class Client {
    public static void main(String[] args) {
        // 첫번째 방법
//        BlueLightRedLight game = new BlueLightRedLight(new Normal());
//        game.blueLight();
//        game.redLight();

        // 두번째 방법(전략 선택 가능)
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());

        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void RedLight() {
                System.out.println("Red lightR");
            }
        });
    }
}
