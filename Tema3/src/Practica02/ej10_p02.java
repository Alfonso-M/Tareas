package Practica02;

import Utilidades.Entrada;

/*Escribir un programa que dada una fecha en formato cadena en la forma
“dd/mm/aaaa” donde dd es el día, mm el mes y aaaa el año de cualquier
año desde el año 2000, escriba un programa que mediante un menú nos
permita realizar las siguientes operaciones
1. Fecha del día siguiente en formato día-mes-año (todo numérico)
2. Fecha el día anterior en formato día-mes-año (todo numérico)
3. Días transcurridos desde principio de año (1 del 1 del año indicado)
4. Días que restan hasta fin de año (31 del 12 del año indicado)*/

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
				System.out.println("1. Fecha del día siguiente en formato día-mes-año (todo numérico)");
				System.out.println("2. Fecha el día anterior en formato día-mes-año (todo numérico)");
				System.out.println("3. Días transcurridos desde principio de año (1 del 1 del año indicado)");
				System.out.println("4. Días que restan hasta fin de año (31 del 12 del año indicado)");
				System.out.println("0. Salir");
				opcion = Entrada.entero();
			} while (opcion < 0 && opcion > 4);
		} while (opcion != 0);
	}
}
