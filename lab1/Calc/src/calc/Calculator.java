
package calc;
import calc.operation.*;
public class Calculator {
    public int sum(int...a){
        Adder adder = new Adder();
        for(int i:a){
            adder.add(i);
        }
        return adder.getSum();
    }
    public int sub(int...a){
        Substracter substracter = new Substracter((short)a[0]);
        for(int i=1;i<a.length;i++){
            substracter.substract((short)a[i]);
        }
        return substracter.getSub();
    }
    public short LogMultiply(int ...a){
        LogMult multiplyer = new LogMult((short)(a[0]));
        for(int i:a){
            multiplyer.mult((short)i);
        }
        return multiplyer.getMult();
    }
    public short Multiply(int ...a){
        Multiplyer multiplyer = new Multiplyer((short)(a[0]));
        for(int i=1;i<a.length;i++){
            multiplyer.mult((short)a[i]);
        }
        return multiplyer.getMult();
    }
    public short Divide(int ...a){
        Divider div = new Divider((short)(a[0]));
        for(int i=1;i<a.length;i++){
            div.divide((short)a[i]);
        }
        return div.getDivide();
    }
}
