package Practica02;
/*3. Realice un programa que genere aleatoriamente 7 operaciones
aritm�ticas consecutivas a las que el usuario deber� ir respondiendo
correctamente para ir avanzando. Los n�meros (aleatorios) sobre los
que se realizan las operaciones deben estar comprendidos entre 1 y 20
y las operaciones aritm�ticas (tambi�n aleatorias) permitidas ser�n la
suma, resta, multiplicaci�n y divisi�n (en el caso de la divisi�n se
realizar� siempre una divisi�n entera).Ejemplo:
5 x 4 = 20
20 � 4 = 16
16 / 8 = 2
2 x 6 = 10 Incorrecto
2 x 6 = 12
12 � 7 = 2 Incorrecto
12 � 7 = 5
5 + 6 = 11
11 / 2 = 5*/

import Utilidades.Entrada;

public class ej03_p02 {

	public static void main(String[] args) {
		char operacion=' ';
		int res,sol,partDer,partIzq;
		res=0;
		sol=0;
		String operadores;
		operadores="+-*/";
		
		for(int i=1;i<7;i++) {
			partDer=(int) (Math.random()*20+1);
			partIzq=(int) (Math.random()*20+1);
			operacion=operadores.charAt((int) (Math.random()*4-1));
			
			switch(operacion) {
			case '+':
				System.out.print(partDer+"+"+partIzq+"=");
				res=Entrada.entero();
				sol=partDer+partIzq;
				break;
			case '-':
				System.out.print(partDer+"-"+partIzq+"=");
				res=Entrada.entero();
				sol=partDer-partIzq;
				break;
			case'*':
				System.out.print(partDer+"*"+partIzq+"=");
				res=Entrada.entero();
				sol=partDer*partIzq;
				break;
			case'/':
				System.out.print(partDer+"/"+partIzq+"=");
				res=Entrada.entero();
				sol=partDer/partIzq;
				break;
			}
			
			if(res==sol)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
	}

}
