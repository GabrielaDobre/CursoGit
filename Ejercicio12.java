package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contrasenya="palomitas";
		int intentos=3;
		
		Scanner datos=new Scanner(System.in);
		System.out.println("Introduce la contraseña:");
		
		
	
		for(int i=0; i<intentos;i++) {
			String pass=datos.next();
			if(contrasenya.equals(pass)) {
				intentos=0;
				System.out.println("Enhorabuena, la contraseña es correcta.");
				
			}else {
				System.out.println("Vuelve a intentarlo.");
								
			}
		}
		
	}
	

}

//Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 
//Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).