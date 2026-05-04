package observer;

import java.util.*;

public class Channel {
    private Stack<String> catalog = new Stack<>();
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer obs) {
        observers.add(obs);
    }



    public void unsubscribe(Observer obs) {
        observers.remove(obs);
    }
    public void addVideo(String title) {
        catalog.push(title);
        notifyObservers();
    }

    private void notifyObservers() {
        for (var obs : observers) {
            obs.Update(catalog);
        }
    }
}
