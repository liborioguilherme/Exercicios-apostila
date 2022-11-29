package While;

import java.util.Scanner;

public class Inss {

	public static void main(String[] args) {
		int i=1 ;
		double salario, desconto;
		Scanner leia = new Scanner (System.in);
		
		while (i<=4) {
			System.out.println("Escreva o salário do "+i+"° usário");
			salario = leia.nextDouble();
			
			if(salario<2000) {
				desconto = salario*8.5/100;
				System.out.println("O seu desconto será de 8,5%, o que equivale a: R$ "+desconto);
			}
			else {
				desconto = salario*11/100;
				System.out.println("O seu desconto será de 11%, o que equivale a: R$ "+desconto);
			}
			System.out.println();
			i++;
		}

	}

}
