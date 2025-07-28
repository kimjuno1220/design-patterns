package main.java.me.wihteship.designpatterns._02_factoryMethod;


public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다 만들었습니다.");
    }

}