package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner datos=new Scanner(System.in);
		System.out.println("Indica un día de la semana: \n1 Lunes \n2 Martes \n3 Miércoles \n4 Jueves \n5 Viernes \n6 Sábado \n7 Domingo");
		int dia=datos.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El lunes es día laboral");
			
			break;
			
		case 2:
			System.out.println("El martes es día laboral");
			
			break;
		case 3:
			System.out.println("El miércoles es día laboral");
			
			break;
		case 4:
			System.out.println("El jueves es día laboral");
			
			break;
		case 5:
			System.out.println("El viernes es día laboral");
			
			break;
		case 6:
			System.out.println("El sábado es día laboral");
			
			break;
		case 7:
			System.out.println("El domingo es día festivo");
			
			break;
		default:
			System.out.println("La opción no es correcta");
		}
		
		
		
		
	}

}

//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. 
//Usa un switch para ello.