
package calc.operation;

public class Multiplyer {
    private short TotalMult;
    public Multiplyer(){
        this.TotalMult = 0;
    }
    public Multiplyer(short a){
        this.TotalMult = a;
    }
    public void mult(short a){
        this.TotalMult = (short) (this.TotalMult * a);
    }
    public short getMult(){
        return this.TotalMult;
    }
}
