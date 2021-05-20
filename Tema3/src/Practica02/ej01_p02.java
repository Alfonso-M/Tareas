package Practica02;
/*1. Un número perfecto es un entero positivo, que es igual a la suma de
todos los enteros positivos (excluido él mismo) que son divisores del
número. El primer número perfecto es 6, ya que los divisores de 6 son 1,
2, 3 y 1 + 2 + 3 = 6. Escriba un programa que lea un número entero
positivo n y muestre por pantalla si ese número es o no perfecto.*/

import Utilidades.Entrada;

public class ej01_p02 {

	public static void main(String[] args) {
		int n,perfecto;
		
		do {
			System.out.println("Introduce el numero ha comprobar positivo");
			n=Entrada.entero();
			perfecto=0;
		}while(n<1);

		for(int i=1;i<n;i++) {
			if(n%i==0)
				perfecto=perfecto+i;
		}
		
		if(perfecto==n && n>1)
			System.out.println(n+" es un numero perfecto");
			else
				System.out.println(n+" no es un numero perfecto ");
	}

}
