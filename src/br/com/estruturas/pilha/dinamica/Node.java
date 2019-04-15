package br.com.estruturas.pilha.dinamica;

public class Node {

	private char element;
    private Node next;
	
	public Node(char element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	public Node(char element) {
		this(element, null);
	}
	
	public char getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(char element) {
		this.element = element;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}
