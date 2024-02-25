
package calc.operation;

public class Divider {
    private short Result;
    public Divider(){
        this.Result = 0;
    }
    public Divider(short a){
        this.Result = a;
    }
    public void divide(short a){
        this.Result = (short) (this.Result / a);
    }
    public short getDivide(){
        return this.Result;
    }
}
