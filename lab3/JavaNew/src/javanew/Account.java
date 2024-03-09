package javanew;

public class Account implements AccountAction,AccountHelpMethods,ClientAccountAction {
    private float balance;
    private boolean open;
    public Account(){
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

    @Override
    public String toString(){
        return "Balance: "+this.getSumma()+" Status:"+this.getOpen();
    }
    @Override
    public boolean equals(Object o){
        boolean result = false;
        if(o!=null && o instanceof Account){
            Account d = (Account) o;
            if((this.balance==d.getSumma())&&(this.open==d.getOpen())){
                result=true;
            }
        }
        return result;
    }
}


