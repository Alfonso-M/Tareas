package Practica02;
/*5. Hacer un programa Java que calcule las raíces reales de la ecuación de
segundo grado. Ax2+Bx+c=0. Considerar todos los casos*/

import Utilidades.Entrada;

public class ej05_p02 {

	public static void main(String[] args) {
		double x, a, b, c;
		boolean incompleta = false;

		System.out.println("Introduce el valor de a");
		a = Entrada.realDoble();
		System.out.println("Introduce el valor de b");
		b = Entrada.realDoble();
		System.out.println("Introduce el valor de c");
		c = Entrada.realDoble();

		if (a == 0 || b == 0 || c == 0) {
			incompleta = true;
			System.out.println("Ecuacion incompleta");
		}

		if (!incompleta) {
			x = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			System.out.println("Las raices real de x1 es: " + x);
		}

		if (!incompleta) {
			x = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			System.out.println("Las raices real de x2 es: " + x);
		}
	}

}
