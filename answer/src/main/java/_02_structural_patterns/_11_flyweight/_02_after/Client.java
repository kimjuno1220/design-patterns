package _02_structural_patterns._11_flyweight._02_after;

import java.lang.Character;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        java.lang.Character c1 = new java.lang.Character('h', "white", fontFactory.getFont("nanum:12"));
        java.lang.Character c2 = new java.lang.Character('e', "white", fontFactory.getFont("nanum:12"));
        java.lang.Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    }
}
