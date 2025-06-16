package observer.ejercicio4.model;

import observer.ejercicio4.database.ParticipanteRepositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParticipanteServicio implements Subject {
    private ParticipanteRepositorio repositorio;
    private List<Observer> observers;

    public ParticipanteServicio(ParticipanteRepositorio repositorio) {
        this.repositorio = repositorio;
        this.observers = new ArrayList<>();
    }

    public void registrarParticipante(String nombre, String telefono, String region, String email) throws SQLException {
        Participante participante = new Participante(nombre, telefono, region, email);
        repositorio.guardar(participante);
        notificar(nombre, email);
    }

    @Override
    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notificar(String nombre, String email) {
        for (Observer observer : observers) {
            observer.update(nombre, email);
        }
    }
}
