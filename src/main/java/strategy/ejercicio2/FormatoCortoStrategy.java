package strategy.ejercicio2;

public class FormatoCortoStrategy implements FormatoFechaStrategy {
    @Override
    public String formatearFecha(int dia, int mes, int anio) {
        return dia + "-" + String.format("%02d", mes) + "-" + anio;
    }
} 