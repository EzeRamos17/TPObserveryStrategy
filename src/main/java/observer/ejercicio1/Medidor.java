package observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Medidor extends Sujeto {
    private String temperatura;
    private ClimaOnline clima;
    //private List<WeatherObserver> observers = new ArrayList<>();

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public String leerTemperatura() {
        //leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        notifyObservers(this.temperatura);
        return this.temperatura;
    }
}
