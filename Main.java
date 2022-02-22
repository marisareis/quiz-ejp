package modulo04.projetoemtrio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("===================================== TESTE SOBRE JAVA =====================================");
		System.out.print("Digite seu nome: ");
		String nome = ler.nextLine();
		System.out.println("============================================================================================");
		
		Mostrar.questoes();
		
		System.out.println("============================================================================================");
		System.out.println("Sua pontuação: " + Mostrar.pontuacao);
		System.out.print("Resultado: ");
		Mostrar.resultadoFinal();
		System.out.println("===================================== GABARITO =============================================");
		Mostrar.gabarito();
		
		
		
	
	}

}
