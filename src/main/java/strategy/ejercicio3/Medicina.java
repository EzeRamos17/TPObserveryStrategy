package strategy.ejercicio3;

public class Medicina extends Producto {
    public Medicina(double precio) {
        super(precio);
    }

    @Override
    protected CalculadorDePrecios crearCalculador() {
        return new CalculadorMedicina();
    }
} 