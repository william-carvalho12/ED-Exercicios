package br.com.estruturas.pilha.dinamica;

public class PilhaDinamica {
	
	private Node topo;
	private int size;

	public PilhaDinamica() {
		topo = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return topo == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public char showTop() throws PilhaVaziaException{
		if (isEmpty()) throw new PilhaVaziaException();
		return topo.getElement();
	}
	
	public void push(char element) {
		Node newNode = new Node(element, topo);
		topo = newNode;
		size++;
	}
	
	public char pop() throws PilhaVaziaException {
		if (isEmpty()) throw new PilhaVaziaException();
		char temp = topo.getElement();
		topo = topo.getNext();
		size--;
		return temp;
	}
}
