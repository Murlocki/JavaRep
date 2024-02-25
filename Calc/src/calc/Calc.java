package calc;
import calc.Calculator;
public class Calc {
 
    public static void main(String[] args) {
        System.out.println("Hello world");
        Calculator calc = new Calculator();
        System.out.println("2+2="+calc.sum(2,2));
        System.out.println("2&2&3="+calc.LogMultiply(2,2,3));
        System.out.println("2-2-3="+calc.sub(2,2,3));
        System.out.println("2*2*3="+calc.Multiply(2,2,3));
        System.out.println("2/2/3="+calc.Divide(10,2,3));
    }
}
