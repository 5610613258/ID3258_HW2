/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author Administrator
 */
public class Matrix {

    //field
    public static final int SIZE = 2;
    public double[][][] m = new double[SIZE][SIZE][SIZE];
    public String s;
    public double RE;
    public double IM;

    //method
    public void sortMatrix(double Re[], double Im[]) {
        for (int x = 0; x < SIZE; x++) {
            if (x == 0) {
                s = "First";
            } else {
                s = "Second";
            }
            System.out.println(s + " Complex to Matrix");
            for (int y = 0; y < SIZE; y++) {
                for (int z = 0; z < SIZE; z++) {
                    if (y == z) {
                        System.out.print(Re[x]);
                    } else if (y < z) {
                        System.out.println(" -" + Im[x]);
                    } else {
                        System.out.print(Im[x] + " ");
                    }
                }

            }
            System.out.println("");
        }

    }

    public void sortaddMatrix(double Re[], double Im[]) {
        for (int x = 0; x < SIZE; x++) {
            RE += Re[x];
            IM += Im[x];
        }

        System.out.println("Add Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(RE);
                } else if (y < z) {
                    System.out.println(" -" + IM);
                } else {
                    System.out.print(IM + " ");
                }
            }

        }
        System.out.println("");

    }
    public void sortsubMatrix(double Re[], double Im[]) {
        RE = Re[0];
        IM = Im[0];
        for (int x = 1; x < SIZE; x++) {

            RE -= Re[x];
            IM -= Im[x];
        }

        System.out.println("Substract Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(RE);
                } else if (y < z) {
                       System.out.println(" " + -1*IM); 
                } else {
                    System.out.print(IM + " ");
                }
            }

        }
        System.out.println("");

    }
    public void sortmulMatrix(double Re[], double Im[]) {
        RE = 1;
        IM = 1;
        for (int x = 0; x < SIZE; x++) {

            RE *= Re[x];
            IM *= Im[x];
        }

        System.out.println("Multiplication Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(RE);
                } else if (y < z) {
                    System.out.println(" -" + IM);
                } else {
                    System.out.print(IM + " ");
                }
            }

        }
        System.out.println("");

    }
}
