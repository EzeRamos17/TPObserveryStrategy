package strategy.ejercicio3;

public class CalculadorAlimento implements CalculadorDePrecios {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0.05;
        double descuentos = precioBase > 100 ? 0.15 : 0;
        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (precioBase > 200) {
            total -= 10; // Envío gratis
        }
        return total;
    }
} 