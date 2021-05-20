package Practica05;
/*10. Desarrolle un programa que calcule la
siguiente operación*/

import java.util.Scanner;

public class ej10_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Introduce a");
		a=sc.nextInt();
		System.out.println("Introduce b");
		b=sc.nextInt();
		System.out.println("Introduce c");
		c=sc.nextInt();
		
		System.out.println(a<=0 || b<=0 || c<=0? "Numero no valido" : "El valor de z es: "+(Math.sqrt((5*a+3*b)/(c+8))));
	}

}
