package br.com.util;

import java.util.Random;

public class Vetores {

	public static int[] carregarVetor(int[] vetor) {
		Random rand = new Random();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(21);
		}
		return vetor;
	}
	
	public static void mostraVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			if(i == vetor.length-1) {
				System.out.printf("%d.\n", vetor[i]);
			}else {
				System.out.printf("%d - ", vetor[i]);
			}
			
		}
	}
	
}
