package reservas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private String room;
	private Date checkout;
	private Date checkin;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reserva() {
		
	}
	
	public Reserva(String room, Date checkout, Date checkin) {
		this.room = room;
		this.checkout = checkout;
		this.checkin = checkin;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Date getCheckout() {
		return checkout;
	}

	public Date getCheckin() {
		return checkin;
	}
	public long duracao() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public String updateDate(Date cin, Date cout) {
		Date agr = new Date();
		if(cin.before(agr)|| cout.before(agr)) {
			return "Reservas só podem ser feitas para datas futuras";
		}else if(!cout.after(cin)){
			return "Data de check out deve ser depois da data de check in";
		}
		this.checkin = cin;
		this.checkout = cout;
		
		return null;
	}
	
}
