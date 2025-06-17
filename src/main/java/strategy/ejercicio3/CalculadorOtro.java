package strategy.ejercicio3;

public class CalculadorOtro implements CalculadorDePrecios {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0.15;
        double descuentos = precioBase > 50 ? 0.05 : 0;
        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (precioBase > 200) {
            total -= 10; // Envío gratis
        }
        return total;
    }
} 