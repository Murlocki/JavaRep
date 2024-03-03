/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc.operation;

/**
 *
 * @author kiril
 */
public class Substracter {
    private short sub;
    
    public Substracter(){
        this.sub = 0;
    }
    public Substracter(short a){
        this.sub = a;
    }
    public void substract(short b){
        this.sub-=b;
    }
    public short getSub(){
        return this.sub;
    }
}
