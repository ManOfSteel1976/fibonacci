// David Pérez Tohux (53688176N)
package org.mps2022.fibonnaci;

public class Fibonacci {

    public long compute(long value){
        long current = 0;
        long next = 1;
        long temp = 0;

        if(value < 0) {
            throw new RuntimeException("Negative value: " + value);
        }else if (value == 0) {
            throw new RuntimeException("Zero position doesn't exist");
        }else{
            for (long cont = 2; cont <= value; cont++) {
                temp = current;
                current = next;
                next = current + temp;
            }
        }
        return current;
    }
}
