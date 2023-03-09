package project;

import java.util.Random;

public class Product {
	private String name;
	private int cuantity;
	private int InWarehouse;
	Random rn = new Random();
		
	public Product(String name, int cuantity) {
		this.name = name;
		this.cuantity = cuantity;
<<<<<<< HEAD
		this.InWarehouse = 150;
	}
	
	public Product(String name) {
		this.name = name;
		this.cuantity = 0;
		this.InWarehouse = 150;
=======
		this.InWarehouse = rn.nextInt(150-15)+15;
>>>>>>> 8a7179b28531691b4c4f79e2c65ad98082cd6a48
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCuantity() {
		return cuantity;
	}
	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
	}
<<<<<<< HEAD
	public String toStringInventory() {
		String r = "" + this.name + " : " + this.InWarehouse + " unidades en almacen";
		return r;
	}
	
	public String toStringCart() {
		String r = "" + this.name + " : " + this.cuantity + " unidades en carrito";
=======
	@Override
	public String toString() {
		String r = "" + this.name + " : " + this.cuantity + " unidades";
>>>>>>> 8a7179b28531691b4c4f79e2c65ad98082cd6a48
		return r;
	}
}
