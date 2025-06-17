package strategy.ejercicio3;

public class Libro extends Producto {
    public Libro(double precio) {
        super(precio);
    }

    @Override
    protected CalculadorDePrecios crearCalculador() {
        return new CalculadorLibro();
    }
} 