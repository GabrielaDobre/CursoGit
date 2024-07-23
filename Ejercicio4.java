package practicasPrimerBloque;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
		
		System.out.println("El área de un círculo es: ");
		System.out.printf("%1.2f", (Math.PI*(Math.pow(radio, 2))));
		
		
	}

}





// Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
//Usa la constante PI y el método pow de Math.