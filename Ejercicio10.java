package practicasPrimerBloque;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entradaDatos=new Scanner(System.in);
		System.out.println("Introduce el nº de ventas: ");
		int numVentas=entradaDatos.nextInt();
		int ganancias=0;
		
		for(int i=0; i<numVentas; i++) {
			Scanner datos2=new Scanner(System.in);
			System.out.println("Introduce el valor de cada venta:");
			ganancias+=datos2.nextInt();
		}
		
		System.out.println("Valor total de las ventas: " + ganancias);
		
		
	}

}

//Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.