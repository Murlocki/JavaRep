package javanew;

public class CreditAccount extends DebtAccount {
    public CreditAccount(float percent,float creditTime){
        super(percent,creditTime);
    }
    public float checkCreditTime(){
        return this.getCreditTime();
    }

    @Override
    public boolean equals(Object o){
        return (o instanceof CreditAccount) && super.equals(o);
    }
}
