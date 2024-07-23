package practicasPrimerBloque;

public class Electrodomestico {
	
	//CONSTANTES
	
	protected final static String COLOR_DEF="blanco";
	protected final static char CONSUMO_ENERGETICO_DEF='F';
	protected final static int PRECIO_BASE_DEF=100;
	protected final static int PESO_DEF=5;
	
	//ATRIBUTOS
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	public Electrodomestico() { //constructor por defecto
		this.precioBase=100;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso=5;
	}
	
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}
	
	//métodos get y set de todos los atributos:
	
	public void setPrecioBase(int precio) {
		this.precioBase=precio;
	}
	public int getPrecioBase() {
		return this.precioBase;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setLetra(char consumoEnergetico) {
		this.consumoEnergetico=consumoEnergetico;
	}
	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public int getPeso() {
		return this.peso;
	}
	
	//otros métodos:
	
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		if(consumoEnergetico == 'A'|| 
		   consumoEnergetico == 'B'||
		   consumoEnergetico == 'C'||
		   consumoEnergetico == 'D'||
		   consumoEnergetico == 'E'||
		   consumoEnergetico == 'F') {
			this.consumoEnergetico=consumoEnergetico;
		}else {	
			this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
		}
	}
	public void comprobarColor(String color) {
		if( color == "blanco"||
			color == "negro" ||
			color == "rojo"  ||
			color == "azul"  ||
			color == "gris") {
			this.color=color;
		}else {
			this.color=COLOR_DEF;
		}
	}
	
	public int precioFinal() {
		if(consumoEnergetico=='A') {
			this.precioBase+=100;
		}else if(consumoEnergetico=='B') {
			this.precioBase+=80;
		}else if(consumoEnergetico=='C') {
			this.precioBase+=60;
		}else if(consumoEnergetico=='D') {
			this.precioBase+=50;	
		}else if(consumoEnergetico=='E') {
			this.precioBase+=30;	
		}else {
			this.precioBase+=10;
		}
		if(peso<19) {
			this.precioBase+=10;
		}else if(peso==20 &&
				 peso<50) {
			this.precioBase+=50;
		}else if(peso==50 &&
				 peso<80) {
			this.precioBase+=80;
		}else {
			this.precioBase+=100;
		}
		
		return this.precioBase;
	}		
		
}	
	
	
	

