package br.com.estruturas.lista.dupla_circular;

public class Node {
	
	private String element;
	private Node next, previous;
	
	public Node(String element, Node prvious, Node next) {
		this.element = element;
		this.previous = previous;
		this.next = next;
	}
	
	public Node(String element) {
		this(element, null, null);
	}
	
	public String getElement() {
		return element;
	}
	
	public void setElement(String element) {
		this.element = element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return previous;
	}
	
	public void setPrev(Node previous) {
		this.previous = previous;
	}
}
