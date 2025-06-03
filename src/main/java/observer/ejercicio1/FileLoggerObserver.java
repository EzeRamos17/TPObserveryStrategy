package observer.ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLoggerObserver implements WeatherObserver {
    private static final String LOG_FILE = "temperature_log.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void update(String temperature) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            String timestamp = LocalDateTime.now().format(formatter);
            writer.println(timestamp + " - Temperatura: " + temperature);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }
} 