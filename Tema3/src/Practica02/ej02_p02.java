package Practica02;
/*2. Escribir todos los números perfectos entre 1 y un valor que se introduce
desde teclad0*/

import Utilidades.Entrada;

public class ej02_p02 {

	public static void main(String[] args) {
		int num,perfecto,cont;
		cont=0;
		
		do {
			System.out.println("Introduce el numero hasta el que quieres buscar");
			num=Entrada.entero();
		}while(num<1);
		
		for(int i=2;i<num;i++) {
			perfecto=0;
			for(int j=1;j<i;j++) {
				if(i%j==0)
					perfecto=perfecto+j;
			}
			
			if(perfecto==i) {
				System.out.println(i);
				cont=cont+1;
			}
		}
		if(cont<1)
			System.out.println("No hay ningún numero perfecto entre el 1 y el numero especificado");
	}

}
