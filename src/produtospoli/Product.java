package produtospoli;

public class Product {
	protected String name;
	protected Double price;
	
	public Product() {
		
	}
	public Product(String n, Double p) {
		this.name = n;
		this.price = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String priceTag() {
		return this.name + "$"+ this.price;
	}
}
