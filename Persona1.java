package practicasPrimerBloque;

import java.util.Scanner;

public class Persona1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String nom;
		int edad;
		String sexo;
		int peso;
		int altura;
		
		Scanner datos=new Scanner(System.in);
		System.out.println("Introduce los siguientes datos: nombre, edad, sexo, peso en kg y altura en cm:");
	
		
		
		
		nom=datos.next();
		edad=datos.nextInt();
		
		sexo=datos.next();
		peso=datos.nextInt();
		altura=datos.nextInt();
		
		
		Persona persona1=new Persona();
		
		persona1.esMayorDeEdad();
		persona1.calcularImc(peso);
		System.out.println(nom + persona1.getEdad(edad) + persona1.getSexo(sexo) + persona1.getPeso(peso) + persona1.getAltura(altura) + 
				persona1.generaDni()+ persona1.calcularImc(peso) + persona1.esMayorDeEdad());
	
		nom=datos.next();
		edad=datos.nextInt();
		sexo=datos.next();
		
		Persona persona2=new Persona(nom, edad, sexo);
		
		persona2.calcularImc(peso);
		persona2.esMayorDeEdad();			
		System.out.println(nom + persona2.getEdad(edad) + persona2.getSexo(sexo) + persona2.getPeso(peso) + persona2.getAltura(altura) + 
				persona2.generaDni()+ persona2.calcularImc(peso) + persona2.esMayorDeEdad());
			
		
		
		Persona persona3=new Persona("Juan", 25, "hombre", 100, 160);
		
			
			System.out.println(persona3.getNom()+ persona3.getEdad(edad)+ persona3.getSexo(sexo) + persona3.getPeso(peso) + persona3.getAltura(altura)+ 
					persona3.calcularImc(peso) + persona3.esMayorDeEdad() + persona3.generaDni() );
			
			
		}
		
		
		
		
		
	}


/*Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, 
el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, 
para este último utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.*/