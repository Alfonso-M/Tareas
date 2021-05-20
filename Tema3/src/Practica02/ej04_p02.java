package Practica02;
/*4. Escriba un programa que calcule el salario semanal de un grupo de
trabajadores, a partir de las horas trabajadas y el precio cobrado por
hora. Ambos valores deben ser solicitados al usuario. La jornada normal
es de 40 horas semanales. Las horas extra se pagan un cincuenta por
ciento más caras que las normales, y pasan a pagarse al doble que las
normales a partir de las 50 horas trabajadas. El proceso termina cuando
el usuario así lo indica. Al final del proceso se debe indicar el total a
pagar por la empresa, el sueldo más alto y el más bajo.*/

import Utilidades.Entrada;

public class ej04_p02 {

	public static void main(String[] args) {
		int salir=0,horas=0;
		double precio,salario,acumulado=0,alto=0,bajo=9999*9999;
		
		do {
			do {
				System.out.println("Introduce la cantidad de horas");
				horas=Entrada.entero();
				if(horas<40)
					System.out.println("Las horas trabajadas deben ser al menos 40");
				
				System.out.println("Introduce cuanto cobras por hora");
				precio=Entrada.realDoble();
				if(precio<1)
					System.out.println("El precio debe ser al menos 1");
			}while(horas<40 || precio<1);
			
			salario=Math.min(horas,40)*precio;
			
			if(horas>40)
				salario+=Math.min((horas-40),10)*precio*0.5;
				
			if(horas>50)
				salario+=(horas-50)*precio*2;
				
			System.out.println("Tu salario es "+salario);
			
			/*if(horas>50) {
				salario=(horas-50)*precio*2+9*precio*50/100+40*precio;
				System.out.println("Tu salario es "+salario);
			}else if(horas>40) {
				salario=(horas-40)*precio*50/100+40*precio;
				System.out.println("Tu salario es "+salario);
			}else {
				salario=40*precio;
				System.out.println("Tu salario es "+salario);
			}*/
			
			if(salario>alto)
				alto=salario;
			if(salario<bajo)
				bajo=salario;
			
			acumulado=acumulado+salario;
			
			System.out.println("Si quieres salir 1, en caso contrario introduce caulquier otro numero");
			salir=Entrada.entero();
		}while(salir!=1);
		
		System.out.println("El salario mas alto es "+alto+", el mas bajo es "+bajo+" y el total a pagar por la empresa es "+acumulado);
	}
}
