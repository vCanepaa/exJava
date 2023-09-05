package produtospoli;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		
	}
	public ImportedProduct(String n, Double p, Double c) {
		super(n,p);
		this.customsFee = c;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	public String priceTag() {
		return this.name + "$"+ this.totalPrice() + "(Customs Fee: $" + this.customsFee+")";
	}
	public Double totalPrice() {
		return this.price + this.customsFee;
	}
}
