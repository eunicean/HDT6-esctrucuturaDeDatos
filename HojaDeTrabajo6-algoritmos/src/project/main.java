package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;  

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		
	
		  
		System.out.println("Seleciones el tipo de Hash a utilizar: \n 1. HashMap \n 2. TreeMap \n 3. Linked HashMap");
		String estructura= teclado.nextLine();   
		Warehouse myWarehouse = new Warehouse("hash");  
		Warehouse myCart = new Warehouse("hash"); 
		
		
		try {
			File file = new File("ListadoProducto.txt");
			Scanner sc = new Scanner(file);
		 
			while (sc.hasNextLine()){

			  String texto=sc.nextLine().toString();
			  String[] valor=texto.split("\\|");
			  valor[0] = valor[0].trim(); 
			  valor[1] = valor[1].trim(); 
			  String[] producto =  {valor[0], valor[1], "0" };    
			  myWarehouse.addProduct(producto);
			}
			
			sc.close();
		}  catch (FileNotFoundException  e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		System.out.println(myWarehouse.getAllData());

		int pochochu = 0 ; 

		while (pochochu == 0){
			
			System.out.println("¿Buen día mi buen amigo, que desea hacer el día de hoy?");
			System.out.println("1. ¿Agregar un producto al carrito?");
			System.out.println("2. ¿Mostrar la categoria de un producto?");
			System.out.println("3. ¿Mostrar los datos del producto, categoría y la cantidad de cada artículo que tienes en tu colección :3");
			System.out.println("4. ¿Mostrar el producto y la categoría de todo en el carrito.");
			System.out.println("5. ¿Mostrar el producto y la categoría existentes, ordenadas por tipo del inventario.");
			System.out.println("6. Salir");
			System.out.println("¿Tons que piensas hacer?");
			int decision= teclado.nextInt();  teclado.nextLine();

			if(decision == 1){
				int j = 0;
				while(j == 0){
				String[] result = new String[3];
				System.out.println("Bueno, aquí está la lista de todos los productos disponibles");
				System.out.println(myWarehouse.getAllData());
				System.out.println("Que categoria es la del producto quiere agregar?");
				System.out.println(myWarehouse.getKeyss());
				int categoria = teclado.nextInt(); teclado.nextLine();
				int producto= 0, cant = 0;
				switch (categoria) {
				case 0:
					result[0] = "Mueble de terraza";

					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Mesas de jardín";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Sillas de jardín";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Conjuntos mesas y sillas de jardín";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Mesas de Ping Pong exteriores";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 1:
					result[0] = "Bebidas";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Cerveza tibetana Barley";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Té frios";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Coca cola 1 litro";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Coca cola 2 litros";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 2:
					result[0] = "Lácteos";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Queso de cabra";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Queso Manchego";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Leche descremada";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Leche deslactosada";
						result[2] = Integer.toString(cant);
						break;
					case 4:
						result[1] = "Leche entera";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 3:
					result[0] = "Condimentos";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 1:
						result[1] = "Sirope de regaliz";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Especies Cajun del chef";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Mezcla Gumbo del chef";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 4:
					result[0] = "Carnes";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Res";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Pollo";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Cerdo";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Camarones";
						result[2] = Integer.toString(cant);
						break;
					case 4:
						result[1] = "Pescados";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 5:
					result[0] = "Frutas";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Peras secas";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Pasas";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Manzana roja";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Manzana verde";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;
				case 6:
					result[0] = "Sillones de masaje";
					System.out.println("Que producto quiere agregar?");
					System.out.println(myWarehouse.getProductsOfKey(categoria));
					producto = teclado.nextInt();teclado.nextLine();
					System.out.println("Cuantos quiere agregar?");
					cant = teclado.nextInt();teclado.nextLine();
					switch (producto) {
					case 0:
						result[1] = "Cojines y colchonetas de masaje";
						result[2] = Integer.toString(cant);
						break;
					case 1:
						result[1] = "Sillones relax y sofás de masajes";
						result[2] = Integer.toString(cant);
						break;
					case 2:
						result[1] = "Sillones de masajes avanzados";
						result[2] = Integer.toString(cant);
						break;
					case 3:
						result[1] = "Sofás camas";
						result[2] = Integer.toString(cant);
						break;

					default:
						break;
					}
					break;

				default:
					break;
				}
				
				myCart.addProduct(result);
				System.out.println("Quieres agregar otro producto?");
				System.out.println("1. Si, 2. No");
				decision= teclado.nextInt();teclado.nextLine();
				 if(decision == 0){
					continue;
				 }  
				 else {
					j = 1;
				 }  
				}

			}

			else if (decision == 2){
				System.out.println("Que producto quiere ver su categoria?");
				String producto= teclado.nextLine();  
				System.out.println("1. Inventario\n 2. Carrito");
				int op= teclado.nextInt();  teclado.nextLine();
				switch (op) {
				case 1:
					System.out.println(myWarehouse.getCategoryOfProduct(producto));
					break;
				case 2:
					System.out.println(myWarehouse.getCategoryOfProduct(producto));;
					break;

				default:
					break;
				}
				
			}

			else if (decision == 3){

				System.out.println("Que producto quiere ver sus Datos?");
				String producto= teclado.nextLine();  
				System.out.println("1. Inventario\n 2. Carrito");
				int op= teclado.nextInt();  teclado.nextLine();
				switch (op) {
				case 1:
					System.out.println(myWarehouse.getDataProduct(producto));
					break;
				case 2:
					System.out.println(myWarehouse.getDataProduct(producto));;
					break;

				default:
					break;
				}
			}

			else if (decision == 4){
				
				System.out.println("Pi pi po po ca ca... ¡nuestros servidores están calculando todos los productos que tenemos en nuestro inventario!");
				System.out.println("Guau! acabamos de descubrir que no nos has comprado casi nada :) pero no importa, ya te doxeamos :))))"  );
				System.out.println(myCart.getDataProductSorted());
			}

			else if (decision == 5){
				System.out.println("Pi pi po po ca ca... ¡nuestros servidores están calculando todos los productos que tenemos en nuestro inventario(de manera ordenada ;)!");
				System.out.println(myWarehouse.getDataProductSorted());
			}
			else{
				pochochu = 1;
			}

		}

	}

}
