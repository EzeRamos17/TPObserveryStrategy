package observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Medidor {
    private String temperatura;
    private ClimaOnline clima;
    private List<WeatherObserver> observers = new ArrayList<>();

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(this.temperatura);
        }
    }

    public String leerTemperatura() {
        //leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        notifyObservers();
        return this.temperatura;
    }
}
