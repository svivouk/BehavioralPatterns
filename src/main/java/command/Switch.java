package command;

public class Switch {
    boolean isOn;
    public void set(){
        if(!isOn){
            System.out.println("Switch: On state");
            isOn = true;
        }
        else {
            System.out.println("Switch: Off state");
            isOn = false;
        }
    }
}
