package strategy.ejercicio1;

public class ColectivosSurStrategy implements EnvioStrategy {
    private static final double COSTO_CAPITAL = 1000;
    private static final double COSTO_GBA = 1500;
    private static final double COSTO_OTROS = 3000;
    private static final double ADICIONAL_PESO_MEDIO = 500;
    private static final double ADICIONAL_PESO_ALTO = 2000;
    private static final double LIMITE_PESO_MEDIO = 5;
    private static final double LIMITE_PESO_ALTO = 30;

    @Override
    public double calcularCostoEnvio(String destino, double pesoTotal) {
        double costoFijo = calcularCostoBase(destino);
        double adicionalPeso = calcularAdicionalPorPeso(pesoTotal);
        
        return costoFijo + adicionalPeso;
    }

    private double calcularCostoBase(String destino) {
        if (destino.equalsIgnoreCase("Capital Federal")) {
            return COSTO_CAPITAL;
        } else if (destino.equalsIgnoreCase("Gran Buenos Aires")) {
            return COSTO_GBA;
        }
        return COSTO_OTROS;
    }

    private double calcularAdicionalPorPeso(double pesoTotal) {
        if (pesoTotal > LIMITE_PESO_ALTO) {
            return ADICIONAL_PESO_ALTO;
        } else if (pesoTotal > LIMITE_PESO_MEDIO) {
            return ADICIONAL_PESO_MEDIO;
        }
        return 0;
    }
} 