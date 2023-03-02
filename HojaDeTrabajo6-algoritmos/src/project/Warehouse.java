package project;

import java.util.*;

public class Warehouse {
	
	Map<String, String> Inventory;
	
	public Warehouse(String hashName) {
		Inventory = Factory.getInstance().Getfactory(hashName);
	}
	public Map<String, String> getInventory() {
		return Inventory;
	}
	public void setInventory(Map<String, String> inventory) {
		Inventory = inventory;
	}

	//methods
	public void addProduct(String[] product) { //1
		
	}
	public String getCategoryOfProduct(String productName) {//2
		String r = "";
		
		return r;
	}
	public String getDataProduct(String productName) {//3
		String r = "";
		
		return r;
	}
	public String getDataProductSorted(String[] productsName) {//4
		String r = "";
		
		return r;
	}
	public String getAllData() {
		String r = "";
		
		return r;
	}
	public String getAllDataSorted() {
		String r = "";
		
		return r;
	}
}
