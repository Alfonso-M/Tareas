package Practica05;
/*1. Escribir un programa que permita convertir de unidades a docenas. El
programa deberá solicitar el número de unidades y deberá calcular el
número de docenas completas correspondientes, así como el número restante
de unidades del total original (no tiene porqué haber siempre un número
exacto de docenas. Por ejemplo, 14 unidades son 1 docena más 2 unidades).*/

import java.util.Scanner;

public class ej01_p03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unidades,docenas;
		
		System.out.println("Introduce la cantidad ha calcular");
		unidades=sc.nextInt();
		
		docenas=unidades/12;
		unidades=unidades-docenas*12;
		
		System.out.println(unidades<0?"La cantidad introducida no puede ser negativa":"Son "+docenas+" docenas más "+unidades+" unidades.");
	}

}