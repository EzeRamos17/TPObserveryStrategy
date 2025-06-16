package strategy.ejercicio2;

public class Persona {
    private int dia;
    private int mes;
    private int anio;
    private FormatoFechaStrategy formatoStrategy;

    public Persona(int dia, int mes, int anio, FormatoFechaStrategy formatoStrategy) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.formatoStrategy = formatoStrategy;
    }

    public void setFormatoStrategy(FormatoFechaStrategy formatoStrategy) {
        this.formatoStrategy = formatoStrategy;
    }

    public String fechaNacimiento() {
        return formatoStrategy.formatearFecha(dia, mes, anio);
    }
}
