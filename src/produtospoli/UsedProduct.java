package produtospoli;

import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}
	public UsedProduct(String n, Double p, Date m) {
		super(n,p);
		this.manufactureDate = m;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public String priceTag() {
		return this.name + "(used) $ "+ this.price + "(Manufacture Date: "+ this.manufactureDate + ")";
	}
}
