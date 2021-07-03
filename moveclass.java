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
public class moveclass {
    
    public static towerclass tc = new towerclass();
    public static inputclass ic = new inputclass();
    
    //allows you to move the disk from one tower to another
    public static void movedisk(int n, int a, int b, int c){
        int d;
        if (n > 0){
            do{
                ic.write("move disk from: ");
                int number = ic.getInput();
                if(number == 1){
                    d = tc.tower[a].pop();
                    
                    ic.write("move disk to: ");
                    number = ic.getInput();
                    if(number == 1){
                        tc.tower[a].push(d);
                    }
                    else if(number == 2){
                        tc.tower[b].push(d);
                    }
                    else if(number == 3){
                        tc.tower[c].push(d);
                    }
                    else{
                        ic.write("invalid move");
                        tc.tower[a].push(d);
                    }
                }
                else if(number == 2){
                    d = tc.tower[b].pop();
                    
                    ic.write("move disk to: ");
                    number = ic.getInput();
                    if(number == 1){
                        tc.tower[a].push(d);
                    }
                    else if(number == 2){
                        tc.tower[b].push(d);
                    }
                    else if(number == 3){
                        tc.tower[c].push(d);
                    }
                    else{
                        ic.write("invalid move");
                        tc.tower[b].push(d);
                    }
                }
                else if(number == 3){
                    d = tc.tower[c].pop();
                    
                    ic.write("move disk to: ");
                    number = ic.getInput();
                    if(number == 1){
                        tc.tower[a].push(d);
                    }
                    else if(number == 2){
                        tc.tower[b].push(d);
                    }
                    else if(number == 3){
                        tc.tower[c].push(d);
                    }
                    else{
                        ic.write("invalid move");
                        tc.tower[c].push(d);
                    }
                }
                else{
                    ic.write("invalid move");
                }
                tc.displaytower();
            }
            while(tc.tower[c].size() < n);
        }
    }
}
