package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos=new Scanner(System.in);
		int num=0;
		
		do {
			System.out.println("Introduce un número:");
			num=datos.nextInt();
			
		}while(num<0);
			
	System.out.println("El nº es: " + num);	
	}

}

//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.