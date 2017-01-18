package epn;

public class Lista {

	protected NodoDoble inicio;  
	
	protected int size;
	
	public Lista() {
		 inicio = null;
		 size = 0;
	}
	
	public boolean estaVacia(){
		if(inicio==  null)
			return true;
		else
			return false;
	}
	
	public void agregarAlInicio(String dato) {
		NodoDoble nuevo = new NodoDoble(dato);
		
	      if (estaVacia()) 
		  inicio = nuevo;
	      else 
		  nuevo.setSiguiente(inicio);
	      inicio.setAnterior(nuevo);
	      inicio=nuevo;

	  }
	
	public NodoDoble devolverNodo(int pos){
        NodoDoble aux=inicio;
        int cont=0;
        
        if(pos<0){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    //Devuelvo aux, con esto salimos de la función
                    return aux; 
                }
                
                //Actualizo el siguiente
                aux=aux.getSiguiente();
                cont++;
                
            }
        }
        
        return aux;
        
    }
	
	public void imprimirLista(){
		System.out.println("Contenido de la lista");
	    System.out.println("---------------------");
	     
	    NodoDoble aux= inicio;
	     
	    while(aux!=null){
	        System.out.println(aux.getElement());
	        aux=aux.getSiguiente();
	    }
	}
	
}
