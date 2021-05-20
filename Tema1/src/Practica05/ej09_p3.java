package Practica05;
/*Programa que lea un número entero N de 5 cifras y muestre sus cifras
desde el final.
Lee 12345 y escribe 5 4 3 2 1*/

import java.util.Scanner;

public class ej09_p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N;
		int com;
		
		System.out.println("Introduce el numero");
		N=sc.next();
		com=Integer.parseInt(N);
		
		System.out.println(com<10000 || com>99999? "Numero no valido" : N.charAt(4)+" "+N.charAt(3)+" "+N.charAt(2)+" "+N.charAt(1)+" "+N.charAt(0));
	}
}
