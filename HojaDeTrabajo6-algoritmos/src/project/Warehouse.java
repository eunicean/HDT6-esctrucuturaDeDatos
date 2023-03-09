package project;

import java.util.*;

public class Warehouse {
	
	Map<String, ArrayList<Product>> myMap;
	
	public Warehouse(String hashName) {
		myMap = Factory.getInstance().Getfactory(hashName);
	}
	public Map<String, ArrayList<Product>> getInventory() {
		return myMap;
	}
	public void setInventory(Map<String, ArrayList<Product>> inventory) {
		myMap = inventory;
	}

	//methods
	public void addProduct(String[] product) { //1
		if(myMap.get(product[0]) == null) {
			ArrayList<Product> temp = new ArrayList<>();
			temp.add(new Product(product[1], Integer.parseInt(product[2])));
			myMap.put(product[0],temp);
		}
		else {
			myMap.get(product[0]).add(new Product(product[1], Integer.parseInt(product[2])));
		}
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
