package Practica05;
/*Programa que lea una cadena muestre
a.Numero de caracteres // muestra el n�mero de caracteres de la
cadena inicial

b.Muestra en may�scula // muestra la cadena inicial en may�sculas

c.Muestra en min�scula // muestra la cadena inicial en min�sculas

d.�Son iguales? // lee una segunda cadena y escribe si las cadenas
son iguales sin importar el tama�o de las letras

e.�Son id�nticas? //Lee una segunda cadena y escribe si las
cadenas son id�nticas*/

import java.util.Scanner;

public class ej11_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cad1,cad2;
		
		System.out.println("Introduce la cadena");
		cad1=sc.next();
		
		System.out.println("La longitud de la cadena es "+cad1.length());
		System.out.println(cad1.toUpperCase());
		System.out.println(cad1.toLowerCase());
		
		System.out.println("Introduce una segunda cadena");
		cad2=sc.next();
		
		System.out.println(cad1.equalsIgnoreCase(cad2)? "Ambas cadenas son iguales" : "La cadena \""+cad1+"\" es distinta de la cadena \""+cad2+"\"");
		System.out.println(cad1.equals(cad2)? "Ambas cadenas son identicas" : "La cadena \""+cad1+"\" es distinta de la cadena \""+cad2+"\"");
	}

}
