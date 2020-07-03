package com.wartsila.camelcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {
    @Test
    public void camelCase_stringWithUnderscoresLowerStart_success() {
        String input = "digital_Product_Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testSomeDashLowerStart_success() {
        String input = "digital-Product-Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }
}
