package strategy.ejercicio3;

public class Alimento extends Producto {
    public Alimento(double precio) {
        super(precio);
    }

    @Override
    protected CalculadorDePrecios crearCalculador() {
        return new CalculadorAlimento();
    }
} 