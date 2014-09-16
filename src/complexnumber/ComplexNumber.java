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
public class ComplexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution b = new Solution();
        InputOutput a = new InputOutput();
        Matrix c = new Matrix();
        a.scan();
        b.Substract(a.Re, a.Im);
        b.Multiplication(a.Re, a.Im);
        b.subRealPart(a.Re);
        b.mulRealPart(a.Re, a.Im);
        b.subImagPart(a.Im);
        b.mulImagPart(a.Re, a.Im);
        b.firMagnitude(a.Re, a.Im);
        b.secMagnitude(a.Re, a.Im);
        b.subMagnitude(a.Re, a.Im);
        b.mulMagnitude(a.Re, a.Im);
        
        System.out.print("Substract : ");
        System.out.println(b.getSubstract());
        System.out.print("Multiplication : ");
        System.out.println(b.getMultiplication());
        System.out.print("Substract Real part : ");
        System.out.printf("%.2f\n", b.getsubRealPart());
        System.out.print("Multiplication Real part : ");
        System.out.printf("%.2f\n", b.getmulRealPart());
        System.out.print("Substract Imaginary part : ");
        System.out.printf("%.2f\n", b.getsubImagPart());
        System.out.print("Multiplication Imaginary part : ");
        System.out.printf("%.2f\n", b.getmulImagPart());
        System.out.print("First Complex number Magnitude : ");
        System.out.printf("%.2f\n", b.getfirMagnitude());
        System.out.print("Second Complex number Magnitude : ");
        System.out.printf("%.2f\n", b.getsecMagnitude());
        System.out.print("Substract Magnitude : ");
        System.out.printf("%.2f\n", b.getsubMagnitude());
        System.out.print("Multiplication Magnitude : ");
        System.out.printf("%.2f\n", b.getmulMagnitude());
        b.compare(a.Re,a.Im);
        c.sortMatrix(a.Re, a.Im);
    }

}
