package observer.ejercicio4.model;

public class Participante {
    private String nombre;
    private String telefono;
    private String region;
    private String email;

    public Participante(String nombre, String telefono, String region, String email) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Debe cargar un nombre");
        }
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("Debe cargar un telefono");
        }
        if (!telefono.matches("\\d{4}-\\d{6}")) {
            throw new IllegalArgumentException("El teléfono debe ingresarse de la forma NNNN-NNNNNN");
        }
        if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
            throw new IllegalArgumentException("Region desconocida. Las conocidas son: China, US, Europa");
        }
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Debe cargar un email válido");
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.region = region;
        this.email = email;
    }

    public String nombre() {
        return nombre;
    }

    public String telefono() {
        return telefono;
    }

    public String region() {
        return region;
    }

    public String email() {
        return email;
    }
}
