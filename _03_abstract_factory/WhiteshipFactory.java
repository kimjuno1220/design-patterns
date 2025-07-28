package main.java.me.wihteship.designpatterns._03_abstract_factory;

import main.java.me.wihteship.designpatterns._02_factoryMethod.DefaultShipFactory;
import main.java.me.wihteship.designpatterns._02_factoryMethod.Ship;
import main.java.me.wihteship.designpatterns._02_factoryMethod.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
