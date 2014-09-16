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
    public void Substract(double Re[], double Im[]) {
        sub = ((Re[0] + Re[1]) + " + " + (Im[0] + Im[1]) + "i");

    }

    public String Multiplication(double Re[], double Im[]) {
        return mul = (((Re[0] * Re[1]) - (Im[0] * Im[1])) + " + " + ((Re[0] * Im[1]) + (Re[1] * Im[0])) + "i");

    }

    public double subRealPart(double Re[]) {
        return subRe = (Re[0] + Re[1]);

    }

    public void mulRealPart(double Re[], double Im[]) {
        mulRe = ((Re[0] * Re[1]) - (Im[0] * Im[1]));
    }

    public void subImagPart(double Im[]) {
        subIm = (Im[0] + Im[1]);
    }

    public void mulImagPart(double Re[], double Im[]) {
        mulIm = ((Re[0] * Im[1]) + (Re[1] * Im[0]));
    }

    public void subMagnitude(double Re[], double Im[]) {
        magsub = Math.sqrt(Math.pow((Re[0] + Re[1]), 2) + Math.pow((Im[0] + Im[1]), 2));
    }

    public void mulMagnitude(double Re[], double Im[]) {
        magmul = Math.sqrt(Math.pow((Re[0] * Re[1]) - (Im[0] * Im[1]), 2) + Math.pow((Re[0] * Im[1]) + (Re[1] * Im[0]), 2));
    }

    public void firMagnitude(double Re[], double Im[]) {
        magfir = Math.sqrt(Math.pow(Re[0], 2) + Math.pow(Im[0], 2));
    }

    public void secMagnitude(double Re[], double Im[]) {
        magsec = Math.sqrt(Math.pow(Re[1], 2) + Math.pow(Im[1], 2));
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
    public void compare(double Re[],double Im[]){
        if(Re[0] > Re[1]){
            System.out.println("First Real part is more than Second Real part.");
        }else  if(Re[0] < Re[1]){
            System.out.println("Second Real part is more than First Real part.");
        }else{
            System.out.println("First Real part is equal to Second Real part.");
        }
        if(Im[0] > Im[1]){
            System.out.println("First Imaginary part is more than Second Imaginary part.");
        }else if(Im[0] < Im[1]){
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
