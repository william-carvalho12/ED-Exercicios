package br.com.p1;

import br.com.util.Vetores;

public class Ex02 {
	
	/*
	 * Implemente uma função recursiva que calcula a soma de todos os valores de um vetor (array) de números.
	 * 
	 * autor: Victor Neves
	 * data: 12/04/2019
	 * 
	 */
	
	public static void main(String[] args) {
		int[] vetor = new int[10];
		vetor = Vetores.carregarVetor(vetor);
		
		Vetores.mostraVetor(vetor);
		
		System.out.printf("\nSoma = %d", mostrarSoma(vetor, vetor.length));
	}
	
	static int mostrarSoma(int[] vetor, int i) {
		i--;
		return (i<0) ? 0 : vetor[i] + mostrarSoma(vetor, i);
	}

}
