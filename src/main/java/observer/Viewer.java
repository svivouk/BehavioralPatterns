package observer;

import javax.swing.text.View;
import java.util.Map;
import java.util.Stack;

public class Viewer implements Observer{
    private String name;
    public Viewer(String name){
        this.name = name;
    }
    @Override
    public void Update(Stack<String> catalog) {
        System.out.println("Hey " + name + ", catalog updated");
    }
}
