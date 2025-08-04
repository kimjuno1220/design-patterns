package main.java.me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory;

import main.java.me.whiteship.designpatterns._01_creational_patterns._02_factoryMethod.ShipFactory;
import main.java.me.whiteship.designpatterns._01_creational_patterns._02_factoryMethod.Ship;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship =  shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getClass().getClass());

    }
}
