
package calc.operation;
public class LogMult {
    private short TotalMult;
    public LogMult(){
        this.TotalMult = 0;
    }
    public LogMult(short a){
        this.TotalMult = a;
    }
    public void mult(short a){
        this.TotalMult = (short) (this.TotalMult & a);
    }
    public short getMult(){
        return this.TotalMult;
    }
}
