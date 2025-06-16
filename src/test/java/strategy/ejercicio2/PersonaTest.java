package strategy.ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    
    @Test
    public void testFormatoCorto() {
        Persona persona = new Persona(3, 6, 1986, new FormatoCortoStrategy());
        assertEquals("3-06-1986", persona.fechaNacimiento());
    }

    @Test
    public void testFormatoLargo() {
        Persona persona = new Persona(3, 6, 1986, new FormatoLargoStrategy());
        assertEquals("3 de Junio de 1986", persona.fechaNacimiento());
    }
} 