package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String phrase = "cette phrase contient 11 voyelles";
        String voyelles = "aeiouyAEIOUY";
        int compteur = 0;
        for(int i=0; i<phrase.length();i++)
        {
            char lettre = phrase.charAt(i);
            for(int j=0; j<voyelles.length();j++)
            {
                if(lettre == voyelles.charAt(j))
                    {
                        compteur++;
                        break;
                    }
            }
        }
        System.out.println(compteur);


    }
}
