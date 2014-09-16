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
        a.scan();
        b.Substract(a.Re1, a.Im1, a.Re2, a.Im2);
        b.Multiplication(a.Re1, a.Im1, a.Re2, a.Im2);
        b.subRealPart(a.Re1, a.Re2);
        b.mulRealPart(a.Re1, a.Im1, a.Re2, a.Im2);
        b.subImagPart(a.Im1, a.Im2);
        b.mulImagPart(a.Re1, a.Im1, a.Re2, a.Im2);
        b.firMagnitude(a.Re1, a.Im1);
        b.secMagnitude(a.Re2, a.Im2);
        b.subMagnitude(a.Re1, a.Im1, a.Re2, a.Im2);
        b.mulMagnitude(a.Re1, a.Im1, a.Re2, a.Im2);

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
        b.compare(a.Re1, a.Im1, a.Re2, a.Im2);
    }

}
