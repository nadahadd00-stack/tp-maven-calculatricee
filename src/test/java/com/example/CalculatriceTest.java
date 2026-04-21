package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    @Test
    void testAdditionner() {
        Calculatrice c = new Calculatrice();
        assertEquals(8, c.additionner(5, 3));
    }

    @Test
    void testSoustraire() {
        Calculatrice c = new Calculatrice();
        assertEquals(6, c.soustraire(10, 4));
    }

    @Test
    void testMultiplier() {
        Calculatrice c = new Calculatrice();
        assertEquals(12, c.multiplier(6, 2));
    }
    @Test
    void testDiviser() {
        Calculatrice c = new Calculatrice();
        assertEquals(2, c.diviser(6, 3));
    }
}