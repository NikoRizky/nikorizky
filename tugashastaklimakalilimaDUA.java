package com.company;

/**
 * Created by Ritz on 25/03/2015.
 */
public class tugashastaklimakalilimaDUA {
    public static void main(String[] args) {
        int puanjang=5;
        int luebar=5;
        for(int i=1;i<=luebar;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=1;j<=puanjang;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
