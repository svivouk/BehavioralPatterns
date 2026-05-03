package command;

public class Checkbox {
    boolean isOn;
    public void set(){
        if(!isOn){
            System.out.println("Checkbox: checked");
            isOn = true;
        }
        else {
            System.out.println("Checkbox: unchecked");
            isOn = false;
        }
    }
}
