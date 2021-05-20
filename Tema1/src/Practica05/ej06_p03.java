package Practica05;
/*6. Programa que lea tres números enteros H, M, S que contienen hora,
minutos y segundos respectivamente, y comprueba si la hora que
indican es una hora válida.*/

import java.util.Scanner;

public class ej06_p03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int H,M,S;
		
		System.out.println("Introduce la hora");
		H=sc.nextInt();
		System.out.println("Introduce los minutos");
		M=sc.nextInt();
		System.out.println("Introduce los segundos");
		S=sc.nextInt();
		
		System.out.println(H<24 && H>=0 && M<60 && M>=0 && S<60 && S>=0? "La hora "+H+":"+M+":"+S+" es valida" : "La hora "+H+":"+M+":"+S+" no es valida");
	}
}
