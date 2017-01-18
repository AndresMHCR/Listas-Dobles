package epn;

public class NodoDoble {
	private String element;
	private NodoDoble siguiente;
	private NodoDoble anterior;
	
	
	public NodoDoble(String element, NodoDoble siguiente, NodoDoble anterior) {
		super();
		this.element = element;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
	public NodoDoble(String element, NodoDoble siguiente) {
		super();
		this.element = element;
		this.siguiente = siguiente;
		this.anterior=null;
	}


	public NodoDoble(String element) {
		super();
		this.element = element;
		this.siguiente=null;
		this.anterior=null;
	}


	public String getElement() {
		return element;
	}


	public void setElement(String element) {
		this.element = element;
	}


	public NodoDoble getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}


	public NodoDoble getAnterior() {
		return anterior;
	}


	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	@Override
	public String toString() {
		return "NodoDoble [element=" + element + ", siguiente=" + this.getSiguiente().getElement()
				+ ", anterior=" + this.getAnterior().getElement() + "]";
	}

	
	
	
	
	
	

}
