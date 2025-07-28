package main.java.me.wihteship.designpatterns._03_abstract_factory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
