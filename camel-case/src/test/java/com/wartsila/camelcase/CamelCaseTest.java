package com.wartsila.camelcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {
    @Test
    public void camelCase_stringWithUnderscoresLowercaseStart_success() {
        String input = "digital_Product_Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testSomeDashLowercaseStart_success() {
        String input = "digital-Product-Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_stringWithUnderscoresUppercaseStart_success() {
        String input = "Digital_Product_Development";
        System.out.println("input: " + input);
        assertEquals("DigitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testSomeDashUppercaseStart_success() {
        String input = "Digital-Product-Development";
        System.out.println("input: " + input);
        assertEquals("DigitalProductDevelopment", CamelCase.toCamelCase(input));
    }

}
