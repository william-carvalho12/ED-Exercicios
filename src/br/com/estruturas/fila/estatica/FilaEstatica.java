package br.com.estruturas.fila.estatica;

public class FilaEstatica {
	
	public Object[] fila;
	public int pri, ult;
	
	public FilaEstatica(int nElementos) {
		this.pri = -1;
		this.ult = -1;
		this.fila = new Object[nElementos];
	}
	
	public boolean isEmpty() {
		return (this.ult == -1) ? true : false;
	}
	
	public boolean isFull() {
		return (this.ult == fila.length-1) ? true : false;
	}
	
	public int getSize() {
		return (this.isEmpty()) ? 0 : this.ult + 1;
	}
	
	public Object showFirst() {
		return(this.isEmpty()) ? null : fila[this.pri];
	}
	
	public void enqueue(Object element) {
		if (isEmpty()) {
			pri = 0;
			ult = 0;
			this.fila[pri] = element;
		}else if(!isFull()){
			this.fila[++ult] = element;
		}
	}
	
	public Object dequeue() {
		if (isEmpty()) {
			return null;
		}else if(getSize() == 1){
			ult--;
			return this.fila[pri--];
		}
		Object temp = this.fila[this.pri];
		for (int i = pri; i < ult; i++) {
			this.fila[i] = this.fila[i + 1];
		}
		ult--;
		return temp;
	}
}
