package Practica02;

import Utilidades.Entrada;

/*Escribir un programa que dada una fecha en formato cadena en la forma
�dd/mm/aaaa� donde dd es el d�a, mm el mes y aaaa el a�o de cualquier
a�o desde el a�o 2000, escriba un programa que mediante un men� nos
permita realizar las siguientes operaciones
1. Fecha del d�a siguiente en formato d�a-mes-a�o (todo num�rico)
2. Fecha el d�a anterior en formato d�a-mes-a�o (todo num�rico)
3. D�as transcurridos desde principio de a�o (1 del 1 del a�o indicado)
4. D�as que restan hasta fin de a�o (31 del 12 del a�o indicado)*/

public class ej10_p02 {

	public static void main(String[] args) {
		String fecha;
		int opcion, valido = 0;

		do {
			do {
				valido = 0;

				System.out.println("Introduce una fecha");
				fecha = Entrada.cadena();

				for (int i = 0; i <= fecha.length() - 1; i++) {
					if (fecha.charAt(i) > 9 || fecha.charAt(i) < 0)
						valido = valido + 1;
				}
				if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/')
					valido = valido - 2;

				if (valido > 0)
					System.out.println("La fecha introducida es incorrecta" + valido);
			} while (valido > 0);

			do {
				System.out.println("1. Fecha del d�a siguiente en formato d�a-mes-a�o (todo num�rico)");
				System.out.println("2. Fecha el d�a anterior en formato d�a-mes-a�o (todo num�rico)");
				System.out.println("3. D�as transcurridos desde principio de a�o (1 del 1 del a�o indicado)");
				System.out.println("4. D�as que restan hasta fin de a�o (31 del 12 del a�o indicado)");
				System.out.println("0. Salir");
				opcion = Entrada.entero();
			} while (opcion < 0 && opcion > 4);
		} while (opcion != 0);
	}
}
