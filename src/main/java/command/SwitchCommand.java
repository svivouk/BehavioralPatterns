package command;

public class SwitchCommand implements Command {
    private final Switch _switch;
    public SwitchCommand(Switch _switch){
        this._switch = _switch;
    }
    @Override
    public void execute() {
        _switch.set();
    }
}
