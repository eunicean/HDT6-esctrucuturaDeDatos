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
		this.InWarehouse = 150;
	}
	
	public Product(String name) {
		this.name = name;
		this.cuantity = 0;
		this.InWarehouse = 150;
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
	public String toStringInventory() {
		String r = "" + this.name + " : " + this.InWarehouse + " unidades en almacen";
		return r;
	}
	
	public String toStringCart() {
		String r = "" + this.name + " : " + this.cuantity + " unidades en carrito";
		return r;
	}
}
