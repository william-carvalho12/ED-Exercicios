package br.com.estruturas.lista.dupla_circular;

import br.com.estruturas.lista.simples.EstouroListaException;

public class ListaEncadeadaDuplaCircular {

	private Node head, tail;
	private int size;

	public ListaEncadeadaDuplaCircular() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (head == null) ? true : false;
	}

	public void insertFirst(Node node) {
		if (isEmpty()) {
			head = node;
			tail = node;
			size++;
		}else {
			node.setNext(head);
			node.setPrev(null);
			head.setPrev(node);
			head = node;
			size++;
		}
	}

	public void insertLast(Node node) {
		if (isEmpty()) {
			insertFirst(node);
		}else {
			node.setPrev(tail);
			node.setNext(head);
			tail.setNext(node);
			tail = node;
			head.setNext(tail);
			size++;
		}
	}

	public Node removeFirst() throws EstouroListaException{
		if (isEmpty()) {
			throw new EstouroListaException();
		}
		Node removedNode = head;
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			head.getNext().setPrev(null);
			head = head.getNext();
		}
		size--;
		return removedNode;
	}
	
	public Node removeLast() throws EstouroListaException{
		if (isEmpty()) {
			throw new EstouroListaException();
		}
		Node removedItem = tail;
		if (head == tail) {
			head = null;
			tail = null;
		}else {
			tail.getPrev().setNext(head);
			tail = tail.getPrev();
		}
		return removedItem;
	}
	
	public void insertAfter(Node node, int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException();
		if (pos == size - 1) {
			// insertLast();
		} else {
			int posicaoAtual;
			Node current;
			if (pos < size / 2) {
				posicaoAtual = 0;
				current = head;
			} else {
				posicaoAtual = size - 1;
				current = tail;
			}
			if (current == head) {
				while (posicaoAtual < pos) {
					current = current.getNext();
					posicaoAtual++;
				}
			} else {
				while (posicaoAtual > pos) {
					current = current.getPrev();
					posicaoAtual--;
				}
			}
			node.setNext(current.getNext());
			node.setPrev(current);
			current.getNext().setPrev(node);
			current.setNext(node);
			size++;
		}
	}

	public Node removeAfter(int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException();
		Node removedItem = null;
		if (pos == size - 1) {
			// removeLast();
		} else {
			int posAtual;
			Node current;
			if (pos < size / 2) {
				posAtual = 0;
				current = head;
			} else {
				posAtual = size - 1;
				current = tail;
			}
			if (current == head) {
				while (posAtual < pos) {
					current = current.getNext();
					posAtual++;
				}
			} else {
				while (posAtual < pos) {
					current = current.getPrev();
					posAtual--;
				}
			}
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			size--;
		}
		return removedItem;
	}

	public void showInverse() {
		if (isEmpty()) {
			System.out.println("A lista estavazia :/");
		}else {
			System.out.println("\nElementos da lista: ");
			Node current = tail;
			do {
				System.out.printf("%s ", current.getElement());
				current = current.getPrev();
			} while (current != tail);
		}
	}
	
	public void show() {
		if (isEmpty()) {
			System.out.println("\nLista vazia :/");
		}else {
			System.out.println("\nElementos da lista");
			Node current = head;
			do {
				System.out.printf("%s ", current.getElement());
				current = current.getNext();
			} while (current != head);
		}
	}
	
	public Node getFirst() throws EstouroListaException {
        if (isEmpty()){
            throw new EstouroListaException();
        }
        return head;
    }

    public Node getLast() throws  EstouroListaException{
        if (isEmpty()){
            throw new EstouroListaException();
        }
        return tail;
    }
}
