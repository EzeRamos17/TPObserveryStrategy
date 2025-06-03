package observer.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {
    private List<Observer> observers;

    protected Sujeto() {
        this.observers = new ArrayList<>();
    }

    public void agregarObservadores(List<Observer> observer){
        this.observers.addAll(observer);
    }

    public void notificar(String data){
        for(Observer observer : observers){
            observer.update(data);
        }
    }
}
