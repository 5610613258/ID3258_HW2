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
        b.Add(a.Re, a.Im);
        b.Substract(a.Re, a.Im);
        b.Multiplication(a.Re, a.Im);
        b.addRealPart(a.Re);
        b.subRealPart(a.Re);
        b.mulRealPart(a.Re, a.Im);
        b.addImagPart(a.Im);
        b.subImagPart(a.Im);
        b.mulImagPart(a.Re, a.Im);
        b.firMagnitude(a.Re, a.Im);
        b.secMagnitude(a.Re, a.Im);
        b.addMagnitude(a.Re, a.Im);
        b.subMagnitude(a.Re, a.Im);
        b.mulMagnitude(a.Re, a.Im);
 
        System.out.print("Add : ");
        System.out.println(b.getAdd());
        System.out.print("Substract : ");
        System.out.println(b.getSubstract());
        System.out.print("Multiplication : ");
        System.out.println(b.getMultiplication());
        System.out.print("Add Real part : ");
        System.out.printf("%.2f\n", b.getaddRealPart());
        System.out.print("Substract Real part : ");
        System.out.printf("%.2f\n", b.getsubRealPart());
        System.out.print("Multiplication Real part : ");
        System.out.printf("%.2f\n", b.getmulRealPart());
        System.out.print("Add Imaginary part : ");
        System.out.printf("%.2f\n", b.getaddImagPart());
        System.out.print("Substract Imaginary part : ");
        System.out.printf("%.2f\n", b.getsubImagPart());
        System.out.print("Multiplication Imaginary part : ");
        System.out.printf("%.2f\n", b.getmulImagPart());
        System.out.print("First Complex number Magnitude : ");
        System.out.printf("%.2f\n", b.getfirMagnitude());
        System.out.print("Second Complex number Magnitude : ");
        System.out.printf("%.2f\n", b.getsecMagnitude());
        System.out.print("Add Magnitude : ");
        System.out.printf("%.2f\n", b.getaddMagnitude());
        System.out.print("Substract Magnitude : ");
        System.out.printf("%.2f\n", b.getsubMagnitude());
        System.out.print("Multiplication Magnitude : ");
        System.out.printf("%.2f\n", b.getmulMagnitude());
        b.compare(a.Re, a.Im);
        c.sortMatrix(a.Re, a.Im);
        c.sortaddMatrix(a.Re, a.Im);
        c.sortsubMatrix(a.Re, a.Im);
        c.sortmulMatrix(a.Re, a.Im);
    }

}
