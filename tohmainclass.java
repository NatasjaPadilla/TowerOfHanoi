/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOWEROFHANOI;

/**
 *
 * @author nat
 */
public class tohmainclass {
    
    public static inputclass ic = new inputclass();
    public static numbersclass nc = new numbersclass();
    
    public static void main(String[] args){
        ic.userinput();
        nc.towerthing(ic.num);
        
    }
    
}
