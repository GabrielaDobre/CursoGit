package practicasPrimerBloque;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="La lluvia en Sevilla es una maravilla";
		
		int vocal=0;
		
		for(int i=0;i<frase.length() ; i++) {
			if(frase.charAt(i)=='a' 
					|| frase.charAt(i)=='e' 
					|| frase.charAt(i)=='i'
					|| frase.charAt(i)=='o' 
					|| frase.charAt(i)=='u') {
				vocal++;
			}	
				
		}
		System.out.println("El nº total de vocales es: " + vocal);
	}
}



//Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total (recorre el String con charAt).