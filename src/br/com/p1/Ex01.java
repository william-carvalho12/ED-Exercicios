package br.com.p1;

import br.com.util.Vetores;

public class Ex01 {

	/*
	 * Implemente uma função recursiva que determine o maior elemento de um vetor (array).
	 * 
	 * autor: Victor Neves
	 * data: 12/04/2019
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		vetor = Vetores.carregarVetor(vetor);
		
		Vetores.mostraVetor(vetor);
		
		System.out.printf("\nMaior valor: %d", maiorValor(vetor.length, vetor[vetor.length-1], vetor));
	}
	
	
	
	static int maiorValor(int i, int m, int[] v) {
		i--;
		if(i < 0) {
			return m;
		}else {
			if(v[i] > m) {
				m = v[i]; 
			}
			return maiorValor(i,m, v);
		}
	}
	
}
