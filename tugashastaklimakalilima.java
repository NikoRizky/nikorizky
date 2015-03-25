package com.company;

/**
 * Created by Ritz on 25/03/2015.
 */
public class tugashastaklimakalilima {
    public static void main(String[] args) {
        int hastak=5;
        for(int i=1;i<=hastak;i++){
            if(i%2==0) {
                System.out.print(" ");
            }
            for(int j=1;j<=hastak;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
