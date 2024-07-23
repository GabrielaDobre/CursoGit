package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos=new Scanner(System.in);
		System.out.println("Indica un mes: ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE");
		String meses=datos.next().toUpperCase();
		Mes elMes=Enum.valueOf(Mes.class, meses); 
		
		System.out.println("El mes: " + elMes);
		System.out.println("Tiene " + elMes.getDescripcion() + " días.");
		
		
		
	}

}

/*Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre).
Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters.
Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e indica que meses tienen ese numero de dias (toda su informacion).
Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.*/

enum Mes{
	ENERO("31 días"), FEBRERO("28 días"), MARZO("31 días"), ABRIL("30 días"), MAYO("31 días"), JUNIO("30 días"), JULIO("31 días"), 
	AGOSTO("31 días"), SEPTIEMBRE("30 días"), OCTUBRE("31 días"), NOVIEMBRE("30 días"), DICIEMBRE("31 días");
	
	private String descripcion;
	private Mes(String descripcion) {
		this.descripcion=descripcion;
}	
	public String getDescripcion() {
		return descripcion;
	}
	
}
