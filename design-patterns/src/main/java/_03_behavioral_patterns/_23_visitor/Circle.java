package _03_behavioral_patterns._23_visitor;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }

}
