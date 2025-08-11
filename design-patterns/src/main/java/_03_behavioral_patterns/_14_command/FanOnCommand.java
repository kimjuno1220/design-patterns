package _03_behavioral_patterns._14_command;
// Command를 구현하는 FanOnCommand클래스 추가
public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {

    }
}
