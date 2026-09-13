package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {
          int x = 5 ;
          for(int ligne  = 1 ; ligne <= x ; ligne ++)
          {
              int nbEspace  = x - ligne ;
              int nbEtoile = 2* ligne -1;

              for (int i =  0 ;  i < nbEspace  ; i++)
              {
                  System.out.print(" ");
              }
              if( ligne == x)
              {
                  for (int t = 0 ; t< nbEtoile; t++)
                  {
                      System.out.print("*");
                  }
              }else{
                  for (int t = 0 ; t< nbEtoile; t++)
                  {
                      if(t==0 || t == nbEtoile-1)
                      {
                          System.out.print("*");
                      }else
                      {

                          System.out.print(" ");
                      }
                  }
              }
              System.out.println();
          }

    }
}
