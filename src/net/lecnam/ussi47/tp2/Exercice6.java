package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        int bool = ThreadLocalRandom.current().nextInt(0,2);
        if(bool == 0)
        {
            System.out.printf("false");
        }else{
            System.out.printf("True");

        }

    }
}
