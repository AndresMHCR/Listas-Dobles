package epn;

public class Aplicacion2 {

	public static void main(String[] args) {
		Lista lisdob = new Lista();
		lisdob.agregarAlInicio("Juan");
		lisdob.agregarAlInicio("Juana");
		lisdob.agregarAlInicio("Pedro");
		lisdob.agregarAlInicio("Pelame");
		lisdob.agregarAlInicio("Ya tu sabe...");
		lisdob.imprimirLista();
		System.out.println(lisdob.devolverNodo(3));
		

	}

}
