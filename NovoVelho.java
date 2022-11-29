package While;

import java.util.Scanner;

public class NovoVelho {

	public static void main(String[] args) {
		int i=1, idade, velho=1, novo=1;
		String nome, nomeNovo = "a", nomeVelho = "a";
		Scanner leia = new Scanner (System.in);
		
		while(i<=10) {
			System.out.println("Informe o seu nome");
			nome = leia.next();
			
			System.out.println("Informe a sua idade");
			idade  = leia.nextInt();
			
			
			if(idade>velho) {
				velho = idade;
				nomeVelho = nome;
				if(i==1) {
					novo = idade;
					nomeNovo = nome;
				}
			}
			else if(idade<novo){
				novo = idade;
				nomeNovo = nome;
			}
			System.out.println();
			i++;
		}
		System.out.println("O mais velho é o "+nomeVelho+" e tem "+velho+" anos");
		System.out.println("O mais novo é o "+nomeNovo+" e tem "+novo+" anos");

	}

}
