package round_robin.aps.grupo.application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);        

		System.out.println("Digite o tamanho da Fila: ");
		int tamFila = sc.nextInt();

		filaCircular fila = new filaCircular(tamFila);

		System.out.println("Digite o quantum do sistema: ");
		int quantum = sc.nextInt();

		System.out.println("Digite o PID do processo: ");
		String pid = sc.nextLine();
		System.out.println("Digite a duracao do processo: ");
		int duracao = sc.nextInt();
		System.out.println("Digite a chegada do processo: ");
		int chegada = sc.nextInt();
		System.out.println("Digite a prioridade do processo: ");
		int prioridade = sc.nextInt();

		classeRoundRobin processo = new classeRoundRobin(pid, duracao, chegada, prioridade);

	}

}
