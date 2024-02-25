/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc.operation;

/**
 *
 * @author kiril
 */
public class Adder {
    private int sum;
    
    public Adder(){
        this.sum = 0;
    }
    public Adder(int a){
        this.sum = a;
    }
    public void add(int b){
        sum+=b;
    }
    public int getSum(){
        return sum;
    }
}
