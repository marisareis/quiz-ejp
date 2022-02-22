package modulo04.projetoemtrio;
import java.util.Scanner;

public class Mostrar {
	
	public static Scanner ler = new Scanner(System.in);
	public static String resposta;
	public static int pontuacao;
	
	
	public static void questoes() {
		for(int i = 0; i < Banco.pergunta.length; i++) {
			System.out.println(Banco.pergunta[i]);
			System.out.println(Banco.item[i]);
			System.out.print("Resposta: ");
			resposta = ler.next();
			if(resposta.equals(Banco.resposta[i])) {
				pontuacao++;
			}
			System.out.println(" ");
		}		
	}
	
	public static void resultadoFinal() {
		if(pontuacao >= 7 ) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
	
	public static void gabarito() {
		int questao = 1;
		for(int i = 0; i < Banco.pergunta.length; i++) {
			System.out.println(questao + ". " + Banco.resposta[i]);
			questao++;
		}
	}
	
}
