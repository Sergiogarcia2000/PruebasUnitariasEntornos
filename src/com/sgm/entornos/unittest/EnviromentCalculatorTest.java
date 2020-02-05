package com.sgm.entornos.unittest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EnviromentCalculatorTest {

    private EnviromentCalculator _EnviromentCalculatorTest = new EnviromentCalculator();;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void should_sum_two_numbers() {
        BigDecimal first = new BigDecimal(5);
        BigDecimal second = new BigDecimal(20);
        BigDecimal result = new BigDecimal(25);
        BigDecimal sumresult;
        sumresult = _EnviromentCalculatorTest.sum(first, second);
        assertEquals(result, sumresult);

    }

    @org.junit.jupiter.api.Test
    void should_substract_two_numbers() {

        BigDecimal first = new BigDecimal(20);
        BigDecimal second = new BigDecimal(5);
        BigDecimal result = new BigDecimal(15);
        BigDecimal subsresult;
        subsresult = _EnviromentCalculatorTest.substract(first, second);
        assertEquals(result, subsresult);

    }

    @org.junit.jupiter.api.Test
    void should_multiply_two_numbers() {
        BigDecimal first = new BigDecimal(5);
        BigDecimal second = new BigDecimal(20);
        BigDecimal result = new BigDecimal(100);
        BigDecimal multresult;
        multresult = _EnviromentCalculatorTest.multiply(first, second);
        assertEquals(result, multresult);
    }

    @org.junit.jupiter.api.Test
    void should_divide_two_numbers() {
        BigDecimal first = new BigDecimal(20);
        BigDecimal second = new BigDecimal(5);
        BigDecimal result = new BigDecimal(4);
        BigDecimal firstZero = new BigDecimal(5);
        BigDecimal secondZero = new BigDecimal(0);
        BigDecimal divresult;
        divresult = _EnviromentCalculatorTest.divide(first, second);
        assertEquals(result, divresult);
        assertEquals(new BigDecimal(0), _EnviromentCalculatorTest.divide(firstZero, secondZero));
    }

    @org.junit.jupiter.api.Test
    void should_mcd_two_numbers() {
        BigDecimal first = new BigDecimal(4);
        BigDecimal second = new BigDecimal(12);
        BigDecimal result = new BigDecimal(4);
        BigDecimal mcdresult;
        mcdresult = _EnviromentCalculatorTest.mcd(first, second);
        assertEquals(result, mcdresult);
    }

    @org.junit.jupiter.api.Test
    void should_mcm_two_numbers() {
        BigDecimal first = new BigDecimal(10);
        BigDecimal second = new BigDecimal(5);
        BigDecimal result = new BigDecimal(10);
        BigDecimal mcmresult;
        mcmresult = _EnviromentCalculatorTest.mcm(first, second);
        assertEquals(result, mcmresult);
    }
}