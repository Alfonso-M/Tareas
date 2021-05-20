package Practica02;
/*6. Crear un programa que lea del teclado una cadena de caracteres y
muestre un menú para realizar la siguiente información:
Su longitud
El carácter de la posición 7
La posición en que aparece el primer carácter 'x' o un aviso
indicando que la cadena no contiene este carácter.
La cadena transformada en mayúsculas
La cadena escrita al revés
Si la cadena es palíndroma*/

import Utilidades.Entrada;

public class ej06_p02 {

	public static void main(String[] args) {
		String cadena, palindroma = "";
		int opcion, caracterX;
		boolean salir = false;

		System.out.println("Introduce una cadena");
		cadena = Entrada.cadena();

		for (int i = cadena.length() - 1; i >= 0; i--) {
			palindroma = palindroma + cadena.charAt(i);
		}

		while (!salir) {
			System.out.println("1. Ver la longitud");
			System.out.println("2. Visualizar el caracter en la posicion numero 7");
			System.out.println("3. Posicion en la aparece 'x' caracter");
			System.out.println("4. Visualizar la cadena en mayusculas");
			System.out.println("5. Ver la cadena al reves");
			System.out.println("6. Comprobar si la cadena es palindroma");
			System.out.println("7. Salir");
			opcion = Entrada.entero();

			switch (opcion) {
			case 1:
				System.out.println("La longitud de la cadena introducida es " + cadena.length());
				break;
			case 2:
				if (cadena.length() > 5)
					System.out.println("El caracter en la posicion 7 es " + cadena.charAt(6));
				else
					System.out.println("La cadena no tiene 7 caracteres");
				break;
			case 3:
				caracterX = cadena.indexOf('x');
				if (caracterX < 0)
					System.out.println("El caracter 'x' no esta en la cadena");
				else
					System.out.println("El caracter 'x' esta en la posiscion " + (caracterX + 1));
				break;
			case 4:
				System.out.println("La cadena en mayuscalas: " + cadena.toUpperCase());
				break;
			case 5:
				System.out.println("La cadena al reves es: " + palindroma);
				break;
			case 6:
				if (palindroma.equals(cadena))
					System.out.println("La cadena es palindroma");
				else
					System.out.println("La cadena no es palindroma");
				break;
			case 7:
				salir = true;
				break;
			default:
				System.out.println("Esta opcion no esta disponible");
			}
		}
	}

}
