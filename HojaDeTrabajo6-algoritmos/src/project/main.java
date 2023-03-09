package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*; 

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		
	
		  
		System.out.println("Seleciones el tipo de Hash a utilizar: \n 1. HashMap \n 2. TreeMap \n 3.Linked HashMap");
		String estructura= teclado.nextLine();   
		Warehouse myWarehouse = new Warehouse(estructura);  
		Warehouse client = new Warehouse(estructura); 
		
		File file = new File("C:\\Users\\pablo\\Desktop\\Estructura de datos\\Git\\Tarea 6\\Continuando\\OWarehouse\\HojaDeTrabajo6-algoritmos\\src\\project\\ListadoProducto.txt");
		Scanner sc = new Scanner(file);
	 
		while (sc.hasNextLine()){

		  String texto=sc.nextLine().toString();
		  String[] valor=texto.split("\\|");
		  valor[0] = valor[0].trim(); 
		  valor[1] = valor[1].trim(); 
		  String[] producto =  {valor[0], valor[1], "0" };    
		  myWarehouse.addProduct(producto);
		}

		int pochochu = 0 ; 

		while (pochochu == 0){
			
			System.out.println("¿Buen día mi buen amigo, que desea hacer el día de hoy?");
			System.out.println("1. Agregar un producto?");
			System.out.println("2. Mostrar la categoria de un producto?");
			System.out.println("3. Mostrar los datos del producto, categoría y la cantidad de cada artículo que tienes en tu colección");
			System.out.println("4. Mostrar los datos del producto, categoría y la cantidad de cada artículo que tienes en tu colección :3");
			System.out.println("5. Mostrar el producto y la categoría de todo el inventario.");
			System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo.");
			System.out.println("¿Tons que piensas hacer?");







		}

		
	}

}
