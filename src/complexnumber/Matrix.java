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

    //method
    public void sortMatrix(double Re[], double Im[]) {
        for (int x = 0; x < SIZE; x++) {
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
}
