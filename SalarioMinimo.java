package While;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		int i=1;
		double salario;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Informe o seu salário");
			salario = leia.nextDouble();
			
			if(salario<954) {
				System.out.println("Seu salário está abaixo do salário mínimo");
				
			}
			else if(salario==954) {
			System.out.println("O seu salário é o salário mínimo");
			
			}
			else {
				System.out.println("Seu salário está acima do salário mínimo");
			}
			System.out.println();
			System.out.println("Deseja continuar a execução do programa? Digite 1 para sim e 2 para não");
			i = leia.nextInt();
		}while(i!=2);

}
}
