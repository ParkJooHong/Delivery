package dto;

public class Delivery {
	private String buyer;
	private String tell;
	private String adress;
	
	public Delivery(String buyer, String tell, String adress) {
		super();
		this.buyer = buyer;
		this.tell = tell;
		this.adress = adress;
	}
	
	
	
	
	
	public String getbuyer() {
		return buyer;
	}
	public void setbuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
