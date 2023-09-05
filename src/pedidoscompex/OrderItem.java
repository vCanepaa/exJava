package pedidoscompex;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private NumberFormat f = new DecimalFormat("0.00");
	
	private List<Product> produtos = new ArrayList<>();
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public Double subTotal() {
		return quantity * price;
	}
	
	
	public void addProduto(Product p) {
		produtos.add(p);
	}
	public void removeProduto(Product p) {
		produtos.remove(p);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Product p: produtos) {
			sb.append(p.getNome()+", ");
			sb.append(Double.parseDouble(f.format(price)));
			sb.append(", " + "Quantity: ");
			sb.append(this.quantity + ", ");
			sb.append("SubTotal: ");
			sb.append("\n$"+this.subTotal());
		}
		return sb.toString();
	}
	
	
}
