package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int bool = ThreadLocalRandom.current().nextInt(1900, 2050);
        System.out.println(bool);
        if ((bool % 4 == 0 && bool % 100 != 0) || bool % 400 == 0) {
            System.out.println("est bissextile");
        } else {

            System.out.println("est non bissextile");

        }
    }
}