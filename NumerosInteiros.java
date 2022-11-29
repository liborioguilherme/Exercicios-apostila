package While;

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		int numero, i=1;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número para ver se o mesmo é negativo, positivo ou neutro");
			numero = leia.nextInt();
			if(numero<0) {
				System.out.println("O número digitado é negativo");
			}
			else if(numero == 0) {
				System.out.println("O número digitado é neutro");
			}
			else {
				System.out.println("O número digitado é positivos");
			}
			System.out.println("Deseja continuar a execução do programa?");
			i = leia.nextInt();
			
		}	
		while(i!=2);
	}

}
