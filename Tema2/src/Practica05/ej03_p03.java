package Practica05;
/*3. Diseña un programa Java para leer las longitudes de los lados de un
triángulo(L1, L2, L3) y calcular el área del mismo de acuerdo con la
siguiente fórmula:*/

import java.util.Scanner;

public class ej03_p03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1,lado2,lado3,sp,area;
		
		System.out.println("Introduce la logitud del primer lado");
		lado1=sc.nextDouble();
		System.out.println("Introduce la logitud del segundo lado");
		lado2=sc.nextDouble();
		System.out.println("Introduce la logitud del tercer lado");
		lado3=sc.nextDouble();
		
		sp=(lado1+lado2+lado3)/2;
		area=Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
		
		System.out.println(lado1<=0 || lado2<=0 || lado3<=0? "No se pueden introducir valores negativos ni cero" : 
			lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2?"El area del triangulo es: "+area : "La longitud de los lados no es la adecuada para un tringulo");
	}
}
