package com.company;

/**
 * Created by Ritz on 24/03/2015.
 */
public class JONIBIKINPUSING {
    static public void main (String args[]){
        int pertama = 1;
        int akhir = 110;
        for (pertama=1; pertama<110; pertama++){
            if (pertama%5==0) {
                System.out.print("JONI'S ");
            }else {
                System.out.print(pertama + " ");
            }
            if (pertama%11==0){
                System.out.print("\n");
            }
        }
    }
}

