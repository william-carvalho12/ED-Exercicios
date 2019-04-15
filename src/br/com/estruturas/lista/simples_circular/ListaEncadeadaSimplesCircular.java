package br.com.estruturas.lista.simples_circular;

import br.com.estruturas.lista.simples.EstouroListaException;

public class ListaEncadeadaSimplesCircular {

	private Node tail, head;
	private int size;

	public ListaEncadeadaSimplesCircular() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (head == null) ? true : false;
	}

	public Node getFirstNode() throws EstouroListaException {
		if (isEmpty())
			throw new EstouroListaException();
		return head;
	}

	public Node getLastNode() throws EstouroListaException {
		if (isEmpty())
			throw new EstouroListaException();
		return tail;
	}

	public void insertFirst(Node node) {
		node.setNext(head);
		head = node;
		size++;
		if (size == 1) {
			tail = head;
		}else {
			tail.setNext(node);
		}
	}

	public void insertLast(Node node) {
		if (isEmpty())
			insertFirst(node);
		else {
			node.setNext(head);
			tail.setNext(node);
			tail = node;
			size++;
		}
	}

	public Node removeFirst() throws EstouroListaException {
		if (isEmpty())
			throw new EstouroListaException();
		Node removedNode = head;
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.getNext();
			tail.setNext(head);
		}
		size--;
		return removedNode;
	}

	public Node removeLast() throws EstouroListaException {
		if (isEmpty())
			throw new EstouroListaException();
		Node removedNode = tail;
		if (tail == head) {
			tail = null;
			head = null;
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != tail) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(head);
			tail = currentNode;
		}
		size--;
		return removedNode;
	}

	public void showList() {
		if (isEmpty())
			System.out.println("A lista está vazia :/");
		else {
			System.out.print("Elementos da Lista: ");
			Node currentNode = head;
			do{
                System.out.printf("\n - %s ",currentNode.getElement());
                currentNode = currentNode.getNext();
            }while (currentNode != head);
		}
	}
}
