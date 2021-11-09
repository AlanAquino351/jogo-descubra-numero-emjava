package jogo;

import java.util.Scanner;

public class TesteJogo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		SistemaJogo sj = new SistemaJogo();

		boolean bingo = false;
		char op;

		do {

			System.out.println("\nDescubra o número sorteado de 1 a 50:");

			sj.gerarNumero();

			do {
				sj.informarNumero();
				bingo = sj.conferir();

			} while (!bingo);

			System.out.print("\nDeseja jogar novamente? [S]im ou [N]o: ");
			op = entrada.next().toUpperCase().charAt(0);

		} while (op != 'N');

		entrada.close();
		System.out.println("Saindo...");
	}
}
