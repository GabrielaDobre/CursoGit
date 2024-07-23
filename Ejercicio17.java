package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		num=sc.nextDouble();
		
		while(num!=-1) {
			contador++;
			System.out.println("Introduce un número");
			num=sc.nextDouble();
		}
		
		System.out.println(contador);
	}

}

//Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.