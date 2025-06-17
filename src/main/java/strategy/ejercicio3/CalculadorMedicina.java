package strategy.ejercicio3;

public class CalculadorMedicina implements CalculadorDePrecios {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0;
        double descuentos = precioBase > 50 ? 0.1 : 0;
        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (precioBase > 100) {
            total -= 10; // Envío gratis
        }
        return total;
    }
} 