package observer.ejercicio1;

public class ConsoleObserver implements WeatherObserver {
    @Override
    public void update(String temperature) {
        // Extraer el valor numérico de la temperatura (asumiendo formato "XX,X °C")
        try {
            String tempStr = temperature.replace(" °C", "").trim();
            // Reemplazar la coma por punto para el parseo
            tempStr = tempStr.replace(",", ".");
            double temp = Double.parseDouble(tempStr);
            
            if (temp < 12) {
                System.out.println("Hace frio, se encenderá la caldera");
            } else if (temp > 17) {
                System.out.println("Hace calor, se encenderá el aire acondicionado");
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al procesar la temperatura: " + temperature);
            e.printStackTrace();
        }
    }
} 