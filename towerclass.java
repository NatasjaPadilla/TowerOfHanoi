/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOWEROFHANOI;

import java.util.Stack;

/**
 *
 * @author nat
 */
public class towerclass {
    
    public static inputclass ic = new inputclass();
    public static Stack<Integer>[] tower = new Stack[4];
    
    towerclass(){
        //the towers
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
    }
    
    //displays the game
    public static void displaytower(){
        System.out.println("  A  |  B  |  C");
        System.out.println("-----+-----+-----");
        for(int i = ic.N - 1; i >= 0; i--)
            {
                String t1 = " ", t2 = " ", t3 = " ";
                try
                    {
                        t1 = String.valueOf(tower[1].get(i));
                    }
                catch (Exception e)
                    {
                    }
                try
                    {
                        t2 = String.valueOf(tower[2].get(i));
                    }
                catch(Exception e)
                    {
                    }
                try
                    {
                        t3 = String.valueOf(tower[3].get(i));
                    }
                catch (Exception e)
                    {
                    }
                System.out.println("  "+t1+"  |  "+t2+"  |  "+t3);
            }
        System.out.println("\n");
    }
    
}
