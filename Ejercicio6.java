package practicasPrimerBloque;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double iva=21.0; 
		Scanner precio=new Scanner(System.in); 
		System.out.println("Introduzca el precio del producto: ");
		
		double dato=precio.nextDouble();
		dato=dato+(dato*iva)/100;
		
		System.out.printf("El precio del producto es: %.2f euros.", dato);
	}

}


//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. 
//El IVA sera una constante que sera del 21%.