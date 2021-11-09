package jogo;

import java.lang.Math;
import java.util.Scanner;

public class SistemaJogo implements Comandos {

	static Scanner entrada = new Scanner(System.in);

	private int numeroGerado;
	private int numeroInf;
	private int cont;

	@Override
	public void gerarNumero() {

		int max = 50, min = 1;
		int to = max - min + 1;

		this.numeroGerado = (int) (Math.random() * to) + min;

		System.out.println(this.numeroGerado);
	}

	@Override
	public void informarNumero() {

		boolean check = false;

		do {
			System.out.print("\nInforme o número de 1 a 50: ");
			this.numeroInf = entrada.nextInt();

			if (this.numeroInf >= 1 && this.numeroInf <= 50) {
				check = true;
			} else if (this.numeroInf < 1) {
				System.out.println("\nError: Número informado é menor que 1!");
				System.out.println("\nPor favor, tente novamente!");
			} else {
				System.out.println("\nError: Número informado é maior que 50!");
				System.out.println("\nPor favor, tente novamente!");
			}

		} while (!check);
	}

	@Override
	public boolean conferir() {

		boolean bingo = false;

		if (this.numeroInf == this.numeroGerado) {
			System.out.println("\nCongratulations!!! Você acertou!!! ");
			System.out.println("\nResposta: " + this.numeroGerado);
			System.out.println("\nVocê acertou na " + (this.cont + 1) + "° tentativa");
			bingo = true;

		} else if (this.getNumeroInf() > this.numeroGerado) {
			System.out.println("\nDica: é menor");
		} else {
			System.out.println("\nDica: é maior");
		}

		this.cont++;

		return bingo;

	}

	public SistemaJogo() {
		this.numeroGerado = 0;
		this.numeroInf = 0;
		this.cont = 0;
	}

	public int getNumeroGerado() {
		return numeroGerado;
	}

	public void setNumeroGerado(int numeroGerado) {
		this.numeroGerado = numeroGerado;
	}

	public int getNumeroInf() {
		return numeroInf;
	}

	public void setNumeroInf(int numeroInf) {
		this.numeroInf = numeroInf;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

}
