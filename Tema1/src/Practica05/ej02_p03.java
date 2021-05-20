package Practica05;
/*2. Programa que lea un carácter y compruebe si es un número (Carácter
entre '0' y '9')*/

import java.util.Scanner;

public class ej02_p03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char num;
		
		System.out.println("Introduce un numero");
		num=sc.next().charAt(0);
		
		System.out.println(num<'0' || num>'9'? "El numero no esta entre 0 y 9" : "El numero esta entre 0 y 9");
	}
}
