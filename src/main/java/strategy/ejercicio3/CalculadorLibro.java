package strategy.ejercicio3;

public class CalculadorLibro implements CalculadorDePrecios {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0.1;
        double descuentos = 0.1;
        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (precioBase > 100) {
            total -= 10; // Envío gratis
        }
        return total;
    }
} 