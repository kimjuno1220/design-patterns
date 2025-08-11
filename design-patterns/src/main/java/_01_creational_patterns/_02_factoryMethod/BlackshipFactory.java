package _01_creational_patterns._02_factoryMethod;

public class BlackshipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {

        return new Blackship();
    }
}
