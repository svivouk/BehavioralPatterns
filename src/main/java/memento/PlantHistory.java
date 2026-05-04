package memento;

import java.util.Stack;

public class PlantHistory {
    private final Stack<Plant.Memento> history = new Stack<>();

    public void push(Plant.Memento memento) {
        history.push(memento);
    }

    public Plant.Memento pop() {
        if (history.isEmpty()) return null;
        return history.pop();
    }
}