package project;

public class Product {
	private int id;
	private String name;
	private int cuantity;
		
	public Product(int id, String name, int cuantity) {
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
