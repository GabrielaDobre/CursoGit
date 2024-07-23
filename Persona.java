package practicasPrimerBloque;

//Haz una clase llamada Persona:
public class Persona  {

	//atributos:
	private String nom;
	private int edad;
	private String sexo="H";
	private int dni;
	private int peso;
	private int altura;
	
	//constructor por defecto:
	public Persona() {
		
	}
	//constructor con el nombre, edad y sexo, el resto por defecto.
	public Persona(String nom, int edad, String sexo) {
		
		this.nom=nom;
		this.edad=edad;
		this.sexo=sexo;
	}
	//Un constructor con todos los atributos como parámetro.
	public Persona(String nom, int edad, String sexo,  int peso, int altura) {
		
		this.nom=nom;
		this.sexo=sexo;
		
		this.peso=peso;
		this.altura=altura;
		
	}

	//métodos set y get:
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		this.nom=nom;
		return nom;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getEdad(int edad) {
		this.edad=edad;
		return "su edad es " + edad;
	}
	public void setSexo(String sexo) {
	}
	public String getSexo(String sexo) {
		this.sexo=sexo;
		return "su sexo es " + sexo;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public String getPeso(int peso) {
		this.peso=peso;
		return "su peso es " + peso;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	public String getAltura( int altura) {
		this.altura=altura;
		return "su altura es " + altura;
	}
	
	//métodos a implementar:
	
	public String esMayorDeEdad() {
		if(this.edad<18) {
			
			return "Es menor de edad";
		}
		return "Es mayor de edad";
	}
	public String generaDni() {
		int valorDado = (int)(Math.random() * 8) + 1;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(this.dni % letras.length());
		String dniEntero = "" + this.dni + letra;
		return "Con DNI" + dniEntero;
	}
	
	public String calcularImc(int peso) {
		int pesoActual=peso/(altura^2);
		if(pesoActual<20) {
			return "está en su peso ideal";
			
		}else if(pesoActual>=25) {
			return "está por debajo de su peso";
		}
	return "tiene sobrepeso";
	}
	
	public String comprobarSexo(char sexo) {
		if(sexo=='M') {
			return "es una mujer";
		}
	return "es un hombre";
	}
}



/*

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el
 más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). 
Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
Los métodos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20,
 la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0 
  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. 
Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.
*/

