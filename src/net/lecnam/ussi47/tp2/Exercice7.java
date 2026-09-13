package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
      int bool = ThreadLocalRandom.current().nextInt(1,101);
      System.out.println(bool);
      if (bool % 2==0) {
          System.out.println("Le nombre x est Pair");
      }else{
          System.out.println("Le nombre x est ImPair");
      }

    }
}
