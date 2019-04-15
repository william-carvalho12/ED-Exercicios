package br.com.estruturas.pilha.estatica;

public class PilhaEstatica {
	
	private Object[] pilha;
	private int topo;
	
	PilhaEstatica(int nElementos){
		this.topo = -1;
		this.pilha = new Object[nElementos];
	}
	
	public boolean isEmpty() {
		return (this.topo == -1) ? true : false;
	}
	
	public boolean isFull() {
		return (this.topo == this.pilha.length-1) ? true : false;
	}
	
	public int getSize() {
		return this.topo + 1;
	}
	
	public Object showTop() {
		return (this.isEmpty()) ? null : this.pilha[this.topo];
	}
	
	public void push(Object element) {
		if(this.topo < this.pilha.length - 1) {
			this.pilha[++topo] = element;
		}
	}
	
	public Object pop() {
		return (isEmpty()) ? null : this.pilha[this.topo--];
	}
	
}
