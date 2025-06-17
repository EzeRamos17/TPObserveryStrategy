package strategy.ejercicio3;

public abstract class Producto {
    private final CalculadorDePrecios calculador;
    private final double precio;

    protected Producto(double precio) {
        this.precio = precio;
        this.calculador = crearCalculador();
    }

    protected abstract CalculadorDePrecios crearCalculador();

    public double precioFinal() {
        return calculador.calcularPrecioFinal(precio);
    }
}
