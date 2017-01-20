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
    public void agregarAlFinal(String dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if(inicio == null){
        	inicio = nuevo;
        }
        else{
        	NodoDoble aux = inicio;
        	while(aux.getSiguiente() != null){
        		aux = aux.getSiguiente();
       
        }
        aux.setSiguiente(nuevo);
        nuevo.setAnterior(aux);

        }
       
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
	
	public void eliminar(String dato){
        if (inicio != null){
                   NodoDoble aux = inicio;
                   NodoDoble ant = null;
                   while (aux != null){
                               if (aux.getElement().compareToIgnoreCase(dato)==0){
                                           if (ant == null){
                                                       inicio = inicio.getSiguiente();
                                                       aux.setSiguiente(null);
                                                       aux= inicio;
                                          
                                           }else {
                                                       ant.setSiguiente(aux.getSiguiente());
                                                       aux.setSiguiente(null);
                                                       aux = ant.getSiguiente();
                                           }                                             
                                           }else{
                                                       ant = aux;
                                                       aux = aux.getSiguiente();
                                           }
                               }
                   }       
        }
	

	public void eliminar(int pos){
		 
        NodoDoble aux=inicio;
        NodoDoble anterior=null;
        int contador=1;
 
        if(pos<1 || pos>=tamaño()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        inicio = inicio.getSiguiente();
                    }else {
                        //Actualizamos el anterior
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
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
