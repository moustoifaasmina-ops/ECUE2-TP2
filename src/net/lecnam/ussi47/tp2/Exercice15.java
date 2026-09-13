package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {

        int x = 5;

        for(int ligne =1 ; ligne <=x ; ligne ++)
        {
            int nbEspaces = x - ligne ;
            int nbEtoile = 2* ligne -1;

            for (int i =0 ; i< nbEspaces ; i++)
            {
                System.out.print(" ");
            }
            for (int i =0 ; i< nbEtoile ; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
