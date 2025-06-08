package strategy.ejercicio1;

public class CorreoArgentinoStrategy implements EnvioStrategy {
    private static final double COSTO_CAPITAL = 500;
    private static final double COSTO_BASE_OTROS = 800;
    private static final double COSTO_POR_KM = 5;
    private static final double DISTANCIA_SIMULADA = 100.0;

    @Override
    public double calcularCostoEnvio(String destino, double pesoTotal) {
        if (destino.equalsIgnoreCase("Capital Federal")) {
            return COSTO_CAPITAL;
        }
        
        return calcularCostoParaOtrosDestinos(destino);
    }

    private double calcularCostoParaOtrosDestinos(String destino) {
        double distancia = obtenerDistanciaDesdeCapital(destino);
        return COSTO_BASE_OTROS + (COSTO_POR_KM * distancia);
    }

    private double obtenerDistanciaDesdeCapital(String destino) {
        return DISTANCIA_SIMULADA;
    }
} 