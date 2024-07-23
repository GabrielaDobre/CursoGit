package practicasPrimerBloque;

public class Titulares{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Cuenta miCuenta=new Cuenta("Juan");
	Cuenta miCuenta1=new Cuenta ("Pablo");

	miCuenta.ingresar(5.2);
	miCuenta.ingresar(5);
	miCuenta.retirar(4.1);
	
	miCuenta.cantidadToString();

	System.out.println("En la cuenta de: " + miCuenta.getTitular() + ", hay un total de: " + miCuenta.getCantidad()+ miCuenta.cantidadToString() );
	
	System.out.println("Esta línea es solo de prueba");
	
	System.out.println("más cambios");
	}
}