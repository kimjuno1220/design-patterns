package _01_creational_patterns._02_factoryMethod;

public class WhiteshipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {

        return new Whiteship();
    }
}
