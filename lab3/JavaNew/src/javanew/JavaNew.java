//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package javanew;

import java.util.HashMap;
import java.util.Scanner;

public class JavaNew {
    public static void countOfWords(String inputString)
    {
        HashMap<String,Integer> dictionary=new HashMap<>();
        int i=0;
        String buffer="";
        inputString=inputString+' ';
        while(i<inputString.length()){
            if(Character.isLetter(inputString.charAt(i))){
                buffer=buffer+inputString.charAt(i);
            }
            else if(buffer!=""){
                int res = dictionary.getOrDefault(buffer,-1);
                if(res==-1){
                    dictionary.put(buffer,1);
                }
                else{
                    dictionary.put(buffer,dictionary.get(buffer)+1);
                }
                buffer="";
            }
            i=i+1;
        }
        System.out.println(dictionary);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inp = in.nextLine();
        countOfWords(inp);
    }
}