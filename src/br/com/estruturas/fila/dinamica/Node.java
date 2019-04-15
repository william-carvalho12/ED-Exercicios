package br.com.estruturas.fila.dinamica;

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
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setElement(char element) {
		this.element = element;
	}
	
	public char getElement() {
		return this.element;
	}
	
	public Node getNext() {
		return this.next;
	}
}
