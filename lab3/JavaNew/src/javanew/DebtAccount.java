package javanew;

public class DebtAccount implements ClientAccountAction,AccountHelpMethods,AccountAction{

    private float percent;
    private float creditTime;
    private float balance;
    private boolean open;

    public DebtAccount(float percent,float creditTime){
        this.percent=percent;
        this.creditTime=creditTime;
        this.balance = 0;
        this.open = true;
    }
    public float getSumma(){
        return this.balance;
    }
    public void setSumma(float summa){
        this.balance=summa;
    }

    public void addMoney(float summa){
        this.balance=this.balance+summa;
    }
    public boolean subMoney(float summa){
        if(this.balance-summa>0){
            this.balance=this.balance-summa;
            return true;
        }
        return false;
    }

    public float check_balance(){
        if(this.open)return this.getSumma();
        return 0;
    }
    public boolean getOpen(){
        return this.open;
    }
    public void setOpen(boolean open){
        this.open=open;
    }

    @Override
    public void closeAccount() {
        this.open=false;
    }
    public void openAccount() {
        this.open=true;
    }


    public void setPercent(float percent){
        this.percent=percent;
    }
    public float getPercent(){
        return this.percent;
    }

    public void setCreditTime(float time){
        this.creditTime=time;
    }
    public float getCreditTime(){
        return this.creditTime;
    }
    @Override
    public String toString(){
        return super.toString()+" Percent:"+this.percent+" Credit Time:"+this.creditTime;
    }
    @Override
    public boolean equals(Object o){
        boolean result = false;
        if(o!=null && o instanceof DebtAccount){
            DebtAccount d = (DebtAccount) o;
            if((this.getSumma()==d.getSumma())&&(this.getOpen()==d.getOpen())&&(this.getPercent()==d.getPercent())&&(this.getCreditTime()==d.getCreditTime())){
                result=true;
            }
        }
        return result;
    }

}
