package strategy.ejercicio1;

public class Producto {
    private String nombre;
    private double precio;
    private double peso; // in kilograms

    public Producto(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    public String Nombre() {
        return nombre;
    }

    public double Precio() {
        return precio;
    }

    public double Peso() {
        return peso;
    }
} 