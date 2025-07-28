package main.java.me.wihteship.designpatterns._02_factoryMethod;

public class BlackshipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {

        return new Blackship();
    }
}
