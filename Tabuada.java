package While;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int i=1, numero, resultado;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número para ver sua tabuada");
		numero = leia.nextInt();
		
		while(i<=10) {
			resultado = numero*i;
			System.out.println(numero+" X "+i+" = "+resultado);
			i++;
		}

	}

}
