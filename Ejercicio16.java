package practicasPrimerBloque;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double resultado=0;
		double num1;
		double num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Denomina el num1:");
		num1=sc.nextDouble();
		System.out.println("Escribe qué operación se va a realizar: \n+ \n- \n* \n/ \n^ \n%");
		String operacion=sc.next();
		System.out.println("Denomina el num2:");
		num2=sc.nextDouble();
		
		
		switch (operacion) {
		case "+":
			resultado=num1+num2;
			break;
		case "-":
			resultado=num1-num2;
			break;
		case "*":
			resultado=num1*num2;
			break;
		case "/":
			resultado=num1/num2;
			break;
		case "^":
			resultado=(int)Math.pow(num1, num2);
			break;
		case "%":
			resultado=num1%num2;
			break;
		}
			
System.out.println( num1+" "+operacion+" "+num2+" = "+resultado);
		
		
			
			
		
		
	}
		
		
		
}



/*Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente.
Al final mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.*/