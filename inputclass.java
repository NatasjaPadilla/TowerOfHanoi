/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOWEROFHANOI;

import java.util.Scanner;

/**
 *
 * @author nat
 */
public class inputclass {
    
    public static int num;
    public static int N;
    
    //this method gets the number of disks to stack
    public static void userinput(){
        write("enter number of disks: ");
        num = getInput();
        N = num;
    }
    
    public static int getInput() {
	Scanner scan = new Scanner(System.in);
	String number = "";
	int num = 0;
	do {
            number = scan.nextLine();
            num = intConverter(number);
	}
	while(num == -1);
	return num;
    }
    
    public static int intConverter(String input) {
	int num = -1;
	try {
            num = Integer.parseInt(input);
	}
	catch(Exception e) {
            write("what you entered is not a number");
	}
	return num;
    }
    
    //prints message
    public static void write(String message) {
	System.out.println(message);
    }
    
}
