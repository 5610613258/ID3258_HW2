package complexnumber;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class InputOutput {

    // field
    public double Re1;
    public double Im1;
    public double Re2;
    public double Im2;

    Solution c = new Solution();

    //constructor
    public InputOutput() {

    }

    public InputOutput(double Re1, double Im1, double Re2, double Im2) {
        this.Re1 = Re1;
        this.Im1 = Im1;
        this.Re2 = Re2;
        this.Im2 = Im2;
    }

    // method
    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Real part : ");
        Re1 = sc.nextDouble();
        System.out.print("Enter First Imaginary part : ");
        Im1 = sc.nextDouble();
        System.out.print("Enter Second Real part : ");
        Re2 = sc.nextDouble();
        System.out.print("Enter Second Imaginary part : ");
        Im2 = sc.nextDouble();

    }

    
}
