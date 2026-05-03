package command;

public class CheckboxCommand implements Command{
    private final Checkbox checkbox;

    public CheckboxCommand(Checkbox checkbox){
        this.checkbox = checkbox;
    }
    public void execute(){
        checkbox.set();
    }
}
