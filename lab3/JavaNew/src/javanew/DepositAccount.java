package javanew;

public class DepositAccount extends DebtAccount{
    public DepositAccount(float percent,float creditTime){
        super(percent,creditTime);
    }
    public float calcPercentSum(){
        return this.getPercent();
    }

    @Override
    public boolean equals(Object o){
        return (o instanceof DepositAccount) && super.equals(o);
    }
}
