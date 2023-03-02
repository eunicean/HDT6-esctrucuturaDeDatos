package project;

public class Product {
	private String name;
	private int cuantity;
		
	public Product(String name, int cuantity) {
		this.name = name;
		this.cuantity = cuantity;
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
	@Override
	public String toString() {
		String r = "" + this.name + " : " + this.cuantity + " unidades";
		return r;
	}
}
