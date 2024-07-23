package practicasPrimerBloque;

import java.util.Scanner;

public class Solucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico electr = new Electrodomestico(100, "lila", 'B', 22);
		electr.comprobarColor("lila");
		electr.comprobarConsumoEnergetico('B');
		System.out.println(electr.getPrecioBase() + " " + electr.getColor() + " " + electr.getConsumoEnergetico() + " " + electr.getPeso() + " " + electr.precioFinal());
		Lavadora lava = new Lavadora(80, 80, "azul", 'C', 60);
		System.out.println(lava.precioFinal() + " " + lava.getColor() + " " + lava.getConsumoEnergetico() + " " + lava.getPeso());
		
		System.out.println("shhht");
		
		
	}

}