package practicasPrimerBloque;

public class Colegio {
	
	private String nombreColegio;
	private int numeroAlumnos;
	private int id; 
	private static int idSiguiente=1; 
	
	public Colegio(String nombreColegio, int numeroAlumnos) {
		this.nombreColegio=nombreColegio;
		this.numeroAlumnos=numeroAlumnos;
		id=idSiguiente;
		idSiguiente++;
	}
	
	
	
	

}

