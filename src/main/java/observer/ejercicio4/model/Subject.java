package observer.ejercicio4.model;

public interface Subject {
    void agregarObserver(Observer observer);
    void notificar(String nombre, String email);
} 