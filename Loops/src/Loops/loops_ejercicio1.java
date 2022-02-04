package Loops;

import java.util.Scanner;

public class loops_ejercicio1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        int i=1;
       
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        while(i<=10) {
        	System.out.println("La tabla del numero que ingresaste es:"+num*i);
        	i++;
        }
	}

}
