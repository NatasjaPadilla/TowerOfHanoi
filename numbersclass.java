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
public class numbersclass {
    
    public static towerclass tc = new towerclass();
    public static moveclass mc = new moveclass();
    
    //displays disks (numbers) on the first tower (column)
    public static void towerthing(int n){
        for (int i = n; i > 0; i--){
            tc.tower[1].push(i);
        }
        tc.displaytower();
        mc.movedisk(n, 1, 2, 3);
    }
    
}
