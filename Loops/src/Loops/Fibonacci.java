package Loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		int contador=0;
		int lalo=1;
		int suma= contador+lalo ;
		
		System.out.println("Hasta que numero quieres contar?");
		int n =console.nextInt();
		
		do {
			System.out.println(suma);
			contador ++;
			lalo++;
		}
		while(contador<=n);
	}

}
