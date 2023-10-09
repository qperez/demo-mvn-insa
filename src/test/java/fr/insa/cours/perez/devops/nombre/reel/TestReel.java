package fr.insa.cours.perez.devops.nombre.reel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestReel {
    public Nombre nombre;

    @BeforeEach
    public void setUp(){
        Double a =nombre.diviser(23.0);
    }


    @Test
    public void testDivPar0(){
        Nombre nombre = new Nombre(42d);
        assertThrows(NumberFormatException.class, ()-> nombre.diviser(0d));
    }

    @Test
    public void testDivParNan(){
        Nombre nombre = new Nombre(42d);
        assertThrows(NumberFormatException.class, ()-> nombre.diviser(Double.NaN),
                "Exception Message");
    }
}
