package observer.ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherChannelService implements ClimaOnline {
    private static final String API_KEY = "f97b22ed8362e05f1ede04489aa8daf2"; // Replace with your API key
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    @Override
    public String temperatura() {
        try {
            String city = "Viedma,Argentina";
            String urlString = String.format("%s?q=%s&units=metric&APPID=%s", BASE_URL, city, API_KEY);
            
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
            JSONObject jsonResponse = new JSONObject(response.toString());
            double temp = jsonResponse.getJSONObject("main").getDouble("temp");
            
            return String.format("%.1f °C", temp);
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al obtener la temperatura";
        }
    }
}
