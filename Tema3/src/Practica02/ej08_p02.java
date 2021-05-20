package Practica02;

import Utilidades.Entrada;

/*8. Se introducen por teclado los números de lista, las notas de 3
evaluaciones (de 1 a 10. Si no son correctas se pedirán de nuevo) y el
número de faltas a clase de una serie de alumnos de un curso. Calcula
la nota media y modificarla obteniendo una nota final en función de las
horas faltadas a clase*/

public class ej08_p02 {

	public static void main(String[] args) {
		boolean valido = false;
		int nota, faltas, acum;

		do {
			valido = true;
			acum = 0;

			System.out.println("Introduce la nota del primer trimestre");
			nota = Entrada.entero();
			acum += nota;
			if (nota < 1 || nota > 10) {
				valido = false;
				System.out.println("Nota no valida");
			}

			System.out.println("Introduce la nota del segundo trimestre");
			nota = Entrada.entero();
			acum += nota;
			if (nota < 1 || nota > 10) {
				valido = false;
				System.out.println("Nota no valida");
			}

			System.out.println("Introduce la nota del tercer trimestre");
			nota = Entrada.entero();
			acum += nota;
			if (nota < 1 || nota > 10) {
				valido = false;
				System.out.println("Nota no valida");
			}

			System.out.println("Introduce el numero de faltas");
			faltas = Entrada.entero();
			if (faltas < 0) {
				valido = false;
				System.out.println("Debe introducir un numero positivo");
			}
		} while (!valido);
		nota = acum / 3;

		if (faltas < 5) {
			if (nota + 1 < 11)
				nota++;
			else
				nota = 10;
			System.out.println("La media de notas de los tres trimestres es: " + nota);
		}

		if (faltas >= 5 && faltas < 10) {
			System.out.println("La media de notas de los tres trimestres es: " + nota);
		}

		if (faltas >= 10 && faltas < 15) {
			if (nota - 1 > 0)
				nota--;
			else
				nota = 1;
			System.out.println("La media de notas de los tres trimestres es: " + nota);
		}
		if (faltas >= 15 && faltas < 20) {
			if (nota - 2 > 0)
				nota = nota - 2;
			else
				nota = 1;
			System.out.println("La media de notas de los tres trimestres es: " + nota);
		}
		if (faltas >= 20) {
			if (nota - 3 > 0)
				nota = nota - 3;
			else
				nota = 1;
			System.out.println("La media de notas de los tres trimestres es: " + nota);
		}
	}

}
