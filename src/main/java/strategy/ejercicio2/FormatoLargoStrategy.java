package strategy.ejercicio2;

public class FormatoLargoStrategy implements FormatoFechaStrategy {
    private static final String[] MESES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    @Override
    public String formatearFecha(int dia, int mes, int anio) {
        return dia + " de " + MESES[mes - 1] + " de " + anio;
    }
} 