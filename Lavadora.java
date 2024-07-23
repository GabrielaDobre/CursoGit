package practicasPrimerBloque;

class Lavadora extends Electrodomestico {

	private int carga=5; 

		//CONSTRUCTORES
	public Lavadora() {}
	
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		
	}
	public Lavadora(int carga, int precioBase, String color, char letra, int peso) {
		super();
		
		
		
	}
	
	//MÉTODOS
	
	public int getCarga() {
		return this.carga;
	}
	
	@Override
	public int precioFinal() {
		if(carga>30) {
			return this.getPrecioBase()+50;		
	}
		return this.getPrecioBase();
		
}
	
}