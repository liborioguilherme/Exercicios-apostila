package While;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		int i=1;
		double valor, lucro, valorOriginal;
		String exe = null;
		Scanner leia = new Scanner (System.in);
		
		while(i==1) {
			System.out.println("Informe o valor atual do produto");
			valor = leia.nextInt();
			
			System.out.println("Informe a porcentagem de lucro em cima do produto");
			lucro = leia.nextDouble();
			
			valorOriginal = valor - (valor*lucro/100);
			
			System.out.println("O valor original do produto era "+valorOriginal);
			
			System.out.println();
			
			System.out.println("Deseja continuar a execução do programa? Digite 'S' para sim e 'N' para não");
			exe = leia.next();
			
			if(exe.equals("N")) {
				i++;
			}
		}	
		

	}

}
