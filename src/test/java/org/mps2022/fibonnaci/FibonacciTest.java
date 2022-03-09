// David Pérez Tohux (53688176N)
package org.mps2022.fibonnaci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * fibonacci 1 -> 0
 * fibonacci 2 -> 1
 * fibonacci 3 -> 1
 * fibonacci 4 -> 2
 * fibonacci 5 -> 3
 * fibonacci 12 -> 89
 * fibonacci negative number
 **/

public class FibonacciTest
{
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish (){
        fibonacci = null;
    }

    // Creamos un test para cada posición entre 1 y 5
    @Test
    public void testComputeReturnZeroIfTheNumberIsOne(){
        long expectedValue = 0;
        long obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsTwo(){
        long expectedValue = 1;
        long obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsThree(){
        long expectedValue = 1;
        long obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsFour(){
        long expectedValue = 2;
        long obtainedValue = fibonacci.compute(4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnThreeIfTheNumberIsFive(){
        long expectedValue = 3;
        long obtainedValue = fibonacci.compute(5);

        assertEquals(expectedValue, obtainedValue);
    }

    // Creamos un test para un número superior a 5 dando un salto
    @Test
    public void testComputeReturn89IfTheNumberIs12(){
        long expectedValue = 89;
        long obtainedValue = fibonacci.compute(12);

        assertEquals(expectedValue, obtainedValue);
    }

    // Creamos un test para la excepción de posición inexistente cuando value es cero
    @Test
    public void testComputeOfZeroPositionRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(0));
    }

    // Creamos un test para la excepción de posición inexistente cuando value es negativo
    @Test
    public void testComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}
