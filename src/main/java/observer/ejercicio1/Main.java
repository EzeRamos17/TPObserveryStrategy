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
        
        System.out.println("Registrando observadores...");
        medidor.addObserver(fileLogger);
        medidor.addObserver(consoleLogger);
        
        // Simular algunas lecturas de temperatura
        System.out.println("\nRealizando primera lectura de temperatura...");
        String temp1 = medidor.leerTemperatura();
        System.out.println("Temperatura leída: " + temp1);
        
        // Esperar un poco antes de la siguiente lectura
        try {
            System.out.println("\nEsperando 5 segundos...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nRealizando segunda lectura de temperatura...");
        String temp2 = medidor.leerTemperatura();
        System.out.println("Temperatura leída: " + temp2);
    }
}
