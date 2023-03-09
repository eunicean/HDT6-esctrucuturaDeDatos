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
		ArrayList<String> myKeys = new ArrayList<String>(myMap.keySet());
		for(int i=0; i<myKeys.size();i++) {
			Product temp = new Product(productName,0);
			if(myMap.get(myKeys.get(i)).contains(temp)) {
				r += myKeys.get(i) + " ";
			}
		}
		
		return r;
	}
	public String getDataProduct(String productName) {//3
		String r = "";
		ArrayList<String> myKeys = new ArrayList<String>(myMap.keySet());

		Product temp = new Product(productName);
		for(int i=0; i<myKeys.size();i++) {
			if(myMap.get(myKeys.get(i)).get(0).getCuantity() == 0) { //inventory
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					if(ProductsLsit.get(j).getName().equals(temp.getName())) {
						r = myKeys.get(i) + " \n " + ProductsLsit.get(j).toStringInventory();
					}
				}
			}
			else { //cart
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					if(ProductsLsit.get(j).getName().equals(temp.getName())) {
						r = myKeys.get(i) + " \n " + ProductsLsit.get(j).toStringCart();
					}
				}
			}
		}
		
		return r;
	}
	public String getDataProductSorted() {//4
		String r = "";
		ArrayList<String> myKeys = new ArrayList<String>(myMap.keySet());
		for(int i=0; i<myKeys.size();i++) {
			r += myKeys.get(i) + " \n";
			if(myMap.get(myKeys.get(i)).get(0).getCuantity() == 0) { //inventory
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					r +=" - " + ProductsLsit.get(j).toStringInventory() + "\n";
				}
			}
			else { //cart
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					r +=" - " + ProductsLsit.get(j).toStringCart() + "\n";
				}
			}
		}
		
		return r;
	}
	public String getDataProductSorted(String[] productsName) {//4
		String r = "";
		return r;
	}
	public String getAllData() {
		String r = "";
		ArrayList<String> myKeys = new ArrayList<String>(myMap.keySet());
		for(int i=0; i<myKeys.size();i++) {
			r += myKeys.get(i) + " \n";
			if(myMap.get(myKeys.get(i)).get(0).getCuantity() == 0) { //inventory
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					r +=" - " + ProductsLsit.get(j).getName() + "\n";
				}
			}
			else { //cart
				ArrayList<Product> ProductsLsit = new ArrayList<Product>(myMap.get(myKeys.get(i)));
				for(int j=0; j<ProductsLsit.size();j++) {
					r +=" - " + ProductsLsit.get(j).getName() + "\n";
				}
			}
		}
		return r;
	}
}
