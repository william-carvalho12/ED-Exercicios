package br.com.estruturas.lista.simples_circular;

public class Node {
	
	private String element;
	private Node next;

	public Node(String element, Node next) {
		this.element = element;
		this.next = next;
	}

	public Node(String element) {
		this(element, null);
	}

	public String getElement() {
		return element;
	}

	public Node getNext() {
		return next;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
