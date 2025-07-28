package main.java.me.wihteship.designpatterns._02_factoryMethod;

public class WhiteshipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {

        return new Whiteship();
    }
}
