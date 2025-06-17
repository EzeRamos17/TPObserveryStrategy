package strategy.ejercicio3;

public class OtroProducto extends Producto {
    public OtroProducto(double precio) {
        super(precio);
    }

    @Override
    protected CalculadorDePrecios crearCalculador() {
        return new CalculadorOtro();
    }
} 