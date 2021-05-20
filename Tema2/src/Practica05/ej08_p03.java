package Practica05;
/*8. Programa que lee un número de 3 cifras y muestra sus cifras por
separado.
Lee 315 y muestra 3 1 5*/

import java.util.Scanner;

public class ej08_p03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		char pri,seg,ter;
		
		System.out.println("Introduce un numero de 3 cifras positivo");
		num=sc.next();
		pri=num.charAt(0);
		seg=num.charAt(1);
		ter=num.charAt(2);
		
		System.out.println(pri>='0' && pri<='9' && seg>='0' && seg<='9' && ter>='0' && ter<='9'? num.charAt(0)+" "+num.charAt(1)+" "+num.charAt(2) : "El valor introducido no es valido valido");
	}
}
