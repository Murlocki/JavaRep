//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package javanew;
import javanew.User;
import javanew.MyDate;

import java.util.ArrayList;

public class JavaNew {
    public static void main(String[] args) {
      Account[] accounts = new Account[10];
      accounts[0]=new SalaryAccount();
      accounts[1]=new CreditAccount(12,14);
      accounts[2]=new DepositAccount(13,15);
      accounts[3]=new DepositAccount(13,15);
      accounts[4]=new DepositAccount(14,15);
      accounts[5]=new CreditAccount(11,14);
      accounts[6]=new CreditAccount(0,14);
      accounts[7]=new CreditAccount(12,14);
      accounts[8]=new SalaryAccount();
      accounts[9]=new SalaryAccount();
      ArrayList<Account> acc = new ArrayList<>();
      for(Account p:accounts){
          System.out.println("``````");
          System.out.println(p);
          boolean res=true;
          for(Account m:acc){
                if(p.equals(m)){res=false;}
              System.out.println(p+" "+m+" "+res);
            }
          if(res) {
              acc.add(p);
          }
        }
        System.out.println("`````````");
        for(Account p:acc){
            System.out.println(p);
        }
        }
}