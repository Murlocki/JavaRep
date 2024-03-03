package javanew;

public class DebtAccount extends Account{

    private float percent;
    private float creditTime;

    public DebtAccount(float percent,float creditTime){
        super();
        this.percent=percent;
        this.creditTime=creditTime;
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
