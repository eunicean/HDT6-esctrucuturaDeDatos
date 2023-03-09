package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*; 

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		Warehouse myWarehouse = new Warehouse("hash");
		File file = new File("C:\\Users\\pablo\\Desktop\\Estructura de datos\\Git\\Tarea 6\\Continuando\\OWarehouse\\HojaDeTrabajo6-algoritmos\\src\\project\\ListadoProducto.txt");
		Scanner sc = new Scanner(file);
	 
		while (sc.hasNextLine()){

		  String texto=sc.nextLine().toString();
		  String[] valor=texto.split("\\|");
		  valor[0] = valor[0].trim(); 
		  valor[1] = valor[1].trim(); 
		  String[] producto =  {valor[0], valor[1], "0" };    
		  myWarehouse.addProduct(producto);

		  //System.out.println(sc.nextLine());
		  for (String a : valor){
			System.out.println(a);

		  }
            



		}
		  



		
		System.out.println("Seleciones el tipo de Hash a utilizar: \n 1. HashMap \n 2. TreeMap \n 3.Linked HashMap");

		
	}

}
