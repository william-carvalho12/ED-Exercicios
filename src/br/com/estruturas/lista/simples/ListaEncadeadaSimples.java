package br.com.estruturas.lista.simples;

public class ListaEncadeadaSimples {
	
	private Node tail, head;
	private int size;

	public ListaEncadeadaSimples() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (head == null) ? true : false;
	}
	
	public Node getFirstNode() throws EstouroListaException{
		if (isEmpty()) throw new EstouroListaException();
		return head;
	}
	
	public Node getLastNode() throws EstouroListaException{
		if (isEmpty()) throw new EstouroListaException();
		return tail;
	}
	
	public void insertFirst(Node newNode) {
		newNode.setNext(head);
		head = newNode;
		size++;
		if (size == 1) {
			tail = head;
		}
	}
	
	public void insertLast(Node newNode) {
		if (isEmpty()) insertFirst(newNode);
		else {
			newNode.setNext(null);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public Node removeFirst() throws EstouroListaException{
		if (isEmpty()) throw new EstouroListaException();
		Node removedNode = head;
		if (head == tail) {
			head = null;
			tail = null;
		}else {
			head = head.getNext();
		}
		size--;
		return removedNode;
	}
	
	public Node removeLast() throws EstouroListaException{
		if (isEmpty()) throw new EstouroListaException();
		Node removedNode = tail;
		if (tail == head) {
			tail = null;
			head = null;
		}else {
			Node currentNode = head;
			while (currentNode.getNext() != tail) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
			tail = currentNode;
		}
		size--;
		return removedNode;
	}
	
	public void showList() {
		if (isEmpty()) System.out.println("A lista está vazia !!");
		else {
			System.out.print("Elementos da Lista: ");
			Node currentNode = head;
			int i = 1;
			while(currentNode != null) {
				System.out.printf("\n %dº - %s",i, currentNode.getElement());
				currentNode = currentNode.getNext();
			}
		}
	}
}
