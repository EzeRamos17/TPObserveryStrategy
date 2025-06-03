package observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {
    protected List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    protected void notifyObservers(String temperatura) {
        for (WeatherObserver observer : observers) {
            observer.update(temperatura);
        }
    }
} 