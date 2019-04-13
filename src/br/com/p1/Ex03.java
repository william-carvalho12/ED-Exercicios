package br.com.p1;

import br.com.util.Vetores;

public class Ex03 {

	/*
	 * Implemente uma função recursiva que inverta os valores de um vetor (array).
	 * 
	 * autor: Victor Neves data: 12/04/2019
	 * 
	 */

	public static void main(String[] args) {
		int[] vetor = new int[10];
		vetor = Vetores.carregarVetor(vetor);

		Vetores.mostraVetor(vetor);

		inverter(vetor, 0, vetor.length - 1);

		Vetores.mostraVetor(vetor);

	}

	static void inverter(int[] vetor, int i, int j) {
		if (i < j) {
			trocar(vetor, i, j);
			inverter(vetor, i + 1, j - 1);
		}
	}

	static void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
