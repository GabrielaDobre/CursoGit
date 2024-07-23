package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos=new Scanner(System.in);
		System.out.println("Indica un día: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO");
		String dia=datos.next().toUpperCase();
		Semana eldia=Enum.valueOf(Semana.class, dia);
		
		System.out.println("Día: " + eldia);
		System.out.println("Tipo de día: " + eldia.getAbreviatura());
	}

}
enum Semana{
	LUNES("LABORAL"), MARTES ("LABORAL"), MIÉRCOLES ("LABORAL"), JUEVES ("LABORAL"), VIERNES ("LABORAL"), SÁBADO ("FESTIVO"), DOMINGO ("FESTIVO");
	
	
	private String abreviatura;
	private Semana(String abreviatura) {
		this.abreviatura=abreviatura;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
		
	
}
	
	

// Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).