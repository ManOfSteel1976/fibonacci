// David Pérez Tohux (53688176N)
package org.mps2022.fibonnaci;

public class Fibonacci {

    public long compute(long value){
        long current = 0;   // Caso base 1
        long next = 1;      // Caso base 2
        long temp = 0;      // Variable auxiliar para el cálculo del siguiente término de la sucesión

        if(value < 0) {
            throw new RuntimeException("Negative value: " + value); // Excepción para números negativos
        }else if (value == 0) {
            throw new RuntimeException("Zero position doesn't exist"); // Excepción para la posición cero
        }else{
            // Si value es 1 (posición 1), el bucle no se ejecuta y se devuelve el valor 0
            // A partir de la posición 2, el bucle se ejecuta para calcular el valor correspondiente
            // la posición correspondiente a value
            for (long cont = 2; cont <= value; cont++) {
                temp = current;
                current = next;
                next = current + temp;
            }
        }
        return current;
    }
}
