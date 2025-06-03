package observer.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear el servicio de clima
        ClimaOnline weatherService = new WeatherChannelService();
        
        // Crear el medidor
        Medidor medidor = new Medidor(weatherService);
        
        // Crear y registrar los observadores
        WeatherObserver fileLogger = new FileLoggerObserver();
        WeatherObserver consoleLogger = new ConsoleObserver();
        
        medidor.addObserver(fileLogger);
        medidor.addObserver(consoleLogger);
        
        // Simular algunas lecturas de temperatura
        System.out.println("Realizando lecturas de temperatura...");
        medidor.leerTemperatura();
        
        // Esperar un poco antes de la siguiente lectura
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        medidor.leerTemperatura();
    }
}
