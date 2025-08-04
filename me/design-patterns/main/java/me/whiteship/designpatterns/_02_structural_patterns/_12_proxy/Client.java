package main.java.me.whiteship.designpatterns._02_structural_patterns._12_proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
