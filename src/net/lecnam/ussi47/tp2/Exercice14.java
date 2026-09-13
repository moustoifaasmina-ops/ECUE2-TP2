package net.lecnam.ussi47.tp2;

import java.util.Locale;

public class Exercice14 {

    public static void main(String[] args) {
        String phrase = "Esope reste ici et se repose";
        String propre = phrase.replace(" ", "").toLowerCase();
        String inverse = "";
        for(int i=propre.length() - 1 ; i>=0 ; i--){
            inverse += propre.charAt(i);
        }
        boolean estPalindrome = propre.equals(inverse);
        if(estPalindrome){
            System.out.println("Vrai");
        }else{
            System.out.println("Faux");
        }

    }
}
