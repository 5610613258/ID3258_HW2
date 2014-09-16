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
public class Solution {

    //field
    public String sub;
    public String mul;
    public double magsub;
    public double magmul;
    public double subRe;
    public double mulRe;
    public double subIm;
    public double mulIm;
    public double magfir;
    public double magsec;

    // method
    public void Substract(double Re1, double Im1, double Re2, double Im2) {
        sub = ((Re1 + Re2) + " + " + (Im1 + Im2) + "i");

    }

    public String Multiplication(double Re1, double Im1, double Re2, double Im2) {
        return mul = (((Re1 * Re2) - (Im1 * Im2)) + " + " + ((Re1 * Im2) + (Re2 * Im1)) + "i");

    }

    public double subRealPart(double Re1, double Re2) {
        return subRe = (Re1 + Re2);

    }

    public void mulRealPart(double Re1, double Im1, double Re2, double Im2) {
        mulRe = ((Re1 * Re2) - (Im1 * Im2));
    }

    public void subImagPart(double Im1, double Im2) {
        subIm = (Im1 + Im2);
    }

    public void mulImagPart(double Re1, double Im1, double Re2, double Im2) {
        mulIm = ((Re1 * Im2) + (Re2 * Im1));
    }

    public void subMagnitude(double Re1, double Im1, double Re2, double Im2) {
        magsub = Math.sqrt(Math.pow((Re1 + Re2), 2) + Math.pow((Im1 + Im2), 2));
    }

    public void mulMagnitude(double Re1, double Im1, double Re2, double Im2) {
        magmul = Math.sqrt(Math.pow((Re1 * Re2) - (Im1 * Im2), 2) + Math.pow((Re1 * Im2) + (Re2 * Im1), 2));
    }

    public void firMagnitude(double Re1, double Im1) {
        magfir = Math.sqrt(Math.pow(Re1, 2) + Math.pow(Im1, 2));
    }

    public void secMagnitude(double Re2, double Im2) {
        magsec = Math.sqrt(Math.pow(Re2, 2) + Math.pow(Im2, 2));
    }

    public double getfirMagnitude() {
        return magfir;
    }

    public double getsecMagnitude() {
        return magsec;
    }

    public double getsubRealPart() {
        return subRe;
    }

    public String getSubstract() {
        return sub;
    }

    public String getMultiplication() {
        return mul;
    }

    public double getmulRealPart() {
        return mulRe;
    }

    public double getsubImagPart() {
        return subIm;
    }

    public double getmulImagPart() {
        return mulIm;
    }

    public double getsubMagnitude() {
        return magsub;
    }

    public double getmulMagnitude() {
        return magmul;
    }
    public void compare(double Re1,double Im1,double Re2, double Im2){
        if(Re1 > Re2){
            System.out.println("First Real part is more than Second Real part.");
        }else  if(Re1 < Re2){
            System.out.println("Second Real part is more than First Real part.");
        }else{
            System.out.println("First Real part is equal to Second Real part.");
        }
        if(Im1 > Im2){
            System.out.println("First Imaginary part is more than Second Imaginary part.");
        }else if(Im1 < Im2){
            System.out.println("Second Imaginary part is more than First Imaginary part.");
        }else{
            System.out.println("First Imaginary part is equal to Second Imaginary part.");
        }
        
        if(magfir > magsec){
            System.out.println("First Magnitude is more than Second Magnitude.");
        }else if(magfir < magsec){
            System.out.println("Second Magnitude is more than First Magnitude.");
        }else{
            System.out.println("First Magnitude is equal to Second Magnitude.");
        }
            
    }
}
