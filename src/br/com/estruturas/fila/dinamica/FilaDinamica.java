package br.com.estruturas.fila.dinamica;

public class FilaDinamica {
	
	private Node pri;
	private Node ult;
	
	public FilaDinamica() {
		pri = null;
		ult = null;
	}
	
	public boolean isEmpty() {
		return (pri == null) ? true : false;
	}
	
	public int getSize() {
		int size = 0;
		Node current = pri;
		while(current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}
	
	public char showFirst() throws FilaVaziaException{
		if (isEmpty())  throw new FilaVaziaException();
		return pri.getElement();
	}
	
	public void enquene(char element) {
		if (ult == null) {
			Node newNode = new Node(element);
			ult = newNode;
			pri = newNode;
		}else {
			Node newNode = new Node(element);
			ult.setNext(newNode);
			ult = newNode;
		}
	}
	
	public char dequeue() throws FilaVaziaException{
		if (isEmpty()) {
			throw new FilaVaziaException();
		}
		if (pri == ult) {
			char temp = pri.getElement();
			pri = null;
			ult = null;
			return temp;
		}else {
			char temp = pri.getElement();
			pri = pri.getNext();
			return temp;
		}
	}
	
}
