package Practica05;
/*7. Programa que pida al usuario un valor para una variable X y calcule y
escriba el valor de y en la función y = 6 x 2 + 8 x -17.*/

import java.util.Scanner;

public class ej07_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Intonduzca el valor de x");
		x=sc.nextInt();
		
		System.out.println(x<=0? "El valor de x no es un valor valido" : "El valor de y es: "+(6*2+8*x-17));
	}

}
