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
	
	public int tamaño()
	{
		NodoDoble aux=inicio;
		while(aux!=null)
		{
			size++;
			aux=aux.getSiguiente();
		}
		return size;
		
	}
	public NodoDoble buscar(int pos){
        NodoDoble aux=inicio;
        
        int cont=1;
        
        if(pos<1|| pos>=tamaño()){
            System.out.println("La posicion insertada no es correcta");
            
        }else{
            while(aux!=null){
                if (pos == cont){

                    return aux; 
                }

                aux=aux.getSiguiente();
                cont++;
                
            }
            
        }
       
        
        return aux;
        
    }
	
	public NodoDoble buscar(String dato){
        NodoDoble aux=inicio;
        
            while(aux!=null){
                if (aux.getElement().equalsIgnoreCase(dato)){
                    return aux; 
                }
                
                aux=aux.getSiguiente();
                
                
            }
            return aux;
        }
        
	public  void vaciar(){
		  inicio=null;
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
