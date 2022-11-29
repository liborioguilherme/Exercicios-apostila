package While;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		double f, celsius, i=1;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Escreva uma temperatura em graus Fahrenheit");
			f = leia.nextInt();
			
			celsius = (f-32)/(1.8);
			
			System.out.println(f+"°F = "+celsius+"°C");
			
			if(celsius<15) {
				System.out.println("Está frio");
			}
			else if(celsius<22) {
				System.out.println("Está ameno");
			}
			else {
				System.out.println("Está calor");
			}
			System.out.println();
			System.out.println("Deseja continuar a execução do programa? Digite 1 para sim e 2 para não.");
			i = leia.nextDouble();
		}
		while(i!=2);
	}

}
