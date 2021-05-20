package Practica02;
/*7. Programa en Java que pida por teclado una nota de tipo double entre 0 y
10 (ambos inclusive). Se desea redondear la nota, de forma que si la
parte decimal es mayor o igual que 0.75, el redondeo se haga por
exceso y en caso contrario, por defecto.*/

import Utilidades.Entrada;

public class ej07_p02 {

	public static void main(String[] args) {
		double nota, notaInt;
		boolean valido = true;

		do {
			System.out.println("Intoduce una nota");
			nota = Entrada.realDoble();

			if (nota < 0 || nota > 10) {
				System.out.println("La nota es no es valida");
				valido = false;
			}
		} while (!valido);

		notaInt = (int) nota;

		if (nota - notaInt < 0.75)
			System.out.println("La nota es " + notaInt);
		else
			System.out.println("La nota es " + (notaInt + 1));
	}

}
