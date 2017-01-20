package epn;

import java.util.Scanner;

public class Aplicacion2 {

	public static void main(String[] args) {
		Lista lisdob = new Lista();
		
		
		lisdob.agregarAlFinal("Lucia");
		lisdob.agregarAlInicio("Juan");
		lisdob.agregarAlInicio("Juana");
		lisdob.agregarAlInicio("Pedro");
		lisdob.agregarAlFinal("Lorena");
		
		
		
		lisdob.imprimirLista();// imprimimos la lista
		System.out.println("\nLa lista contiene "+lisdob.tamaño()+" elementos.\n");// numero de elementos de lista
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingrese la posicion que desea buscar");//busqueda por posicion
		int pos= Integer.parseInt(scn.nextLine());
		
		if(lisdob.buscar(pos)!=null)
			System.out.println(lisdob.buscar(pos));
		else
			System.out.println("la posicion ingresada no existe.");
		
		System.out.println("\nIngrese el nombre que desea buscar");//busqueda por nombre
		String dato= scn.nextLine();
		if(lisdob.buscar(dato)!=null)
			System.out.println(lisdob.buscar(dato));
		else
			System.out.println("El nombre ingresado no existe.");
		
		System.out.println("Ingrese el nombre que desea eliminar.");
		String dat = scn.nextLine();
		if(lisdob.buscar(dat)!=null){
			lisdob.eliminar(dat);
			lisdob.imprimirLista();
		}
		else
			System.out.println("El nombre ingresado no existe.");
		
		System.out.println("Ingrese la posicion que desea eliminar.");
		int datoe = scn.nextInt();
		if(lisdob.buscar(datoe)!=null){
			lisdob.eliminar(datoe);
			lisdob.imprimirLista();
		}
		else
			System.out.println("El nombre ingresado no existe.");
		
		lisdob.vaciar(); //vaciado de lista
		if (lisdob.estaVacia())
			 System.out.println("Lista vacia");
		else
		lisdob.imprimirLista();
		scn.close();

	}

}
