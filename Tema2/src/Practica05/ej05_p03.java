package Practica05;
/*5. Programa que lea un carácter por teclado y compruebe si es una vocal
mayúscula sin tilde.*/

import java.util.Scanner;

public class ej05_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		
		System.out.println("Introduce el caracter a comparar");
		letra=sc.next().charAt(0);
		
		System.out.println(letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U' ? "En caracter "+letra+" es una vocal mayuscula sin tilde":"El caracter no es una vocal mayuscula sin tilde");
	}

}
