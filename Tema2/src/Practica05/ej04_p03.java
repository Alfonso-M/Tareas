package Practica05;
/*4. Dadas dos variables enteras A y B hacer un algoritmo para
intercambiar sus valores. La salida debe ser:
A vale 7 y B vale 3
Al final A vale 3 y B vale 7
Al final del programa A debe valer 3 y B 7*/

import java.util.Scanner;

public class ej04_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,aux;
		
		System.out.println("Introduce el valor de A");
		A=sc.nextInt();
		System.out.println("Introduce el valor de B");
		B=sc.nextInt();
		
		aux=A;
		A=B;
		B=aux;
		
		System.out.println("A vale: "+A);
		System.out.println("B vale: "+B);
	}

}
