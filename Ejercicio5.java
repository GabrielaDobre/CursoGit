package practicasPrimerBloque;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num1=new Scanner(System.in);
		System.out.println("Introduce un número, por favor: ");
		int numero=num1.nextInt();
		
		if(numero%2==0) {
			System.out.println("El número es divisible entre dos");
		}else {
			System.out.println("El número no es divisible entre dos");
		}
	}

}

//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.