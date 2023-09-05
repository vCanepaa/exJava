package pedidoscompex;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus order;
	private List<OrderItem> items = new ArrayList<>();
	private List<Client> cliente = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus order) {
		this.moment = moment;
		this.order = order;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return order;
	}

	public void setOrder(OrderStatus order) {
		this.order = order;
	}
	
	
	public void addItem(OrderItem it) {
		items.add(it);
	}
	public void removeItem(OrderItem it) {
		items.remove(it);
	}
	public Double total() {
		Double soma = 0.0;
		for(OrderItem it : items) {
			soma += it.subTotal();
		}
		
		return soma;
	}
	public void addClient(Client c) {
		cliente.add(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("ORDER MOMENT: ");
		sb.append(moment+ " \n");
		sb.append("ORDER STATUS: ");
		sb.append(order+ "\n");
		for(Client c: cliente) {
			sb.append("CLIENTE: ");
			sb.append(c.getName() + " ");
			sb.append("("+ c.getBirthDate() + ") ");
			sb.append("- "+ c.getEmail());
		}
		sb.append("\nORDER ITEMS: \n");
		for(OrderItem it : items) {
			sb.append(it.toString());
		}
		sb.append("\nTotal Price: ");
		sb.append("$"+ this.total());
		return sb.toString();
		}
	
	
	
	
}
