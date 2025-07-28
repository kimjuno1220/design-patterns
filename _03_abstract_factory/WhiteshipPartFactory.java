package main.java.me.wihteship.designpatterns._03_abstract_factory;

public class WhiteshipPartFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
