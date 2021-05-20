package Practica02;
/*Escribe una funci�n en pseudo c�digo que devuelva el t�rmino n
(siendo N un n�mero entero positivo distinto de 0) de la serie
1, 1, 3,5,11, 21,43... y as� sucesivamente. Date cuenta, que, 
para obtener un n�mero, suma el doble del n�mero situado dos 
posiciones anteriores m�s el anterior

an=2an-2+an-1

Es decir, si n= 5 escribir� 11*/

import Utilidades.Entrada;

public class ej09_p02 {

	public static void main(String[] args) {
		int n;
		int aux = 1;
		int num = 1;
		int res = 0;

		do {
			System.out.println("Introduce un numero");
			n = Entrada.entero();
		} while (n < 1);

		for (int i = 0; i < n; i++) {
			if (i >= 2) {
				res = num + aux * 2;
				aux = num;
				num = res;
			} else
				res = 1;
		}
		System.out.println("El resultado es " + res);
	}

}
