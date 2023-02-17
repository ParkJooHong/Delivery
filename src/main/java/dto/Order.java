package dto;

public class Order {
	private String chicName;
	private int howNum;
	private String[] add;
	private String plz;
	
	
	public Order(String chicName, int howNum, String[] add, String plz) {
		super();
		this.chicName = chicName;
		this.howNum = howNum;
		this.add = add;
		this.plz = plz;
	}

	public String getChicName() {
		return chicName;
	}

	public void setChicName(String chicName) {
		this.chicName = chicName;
	}

	public int getHowNum() {
		return howNum;
	}

	public void setHowNum(int howNum) {
		this.howNum = howNum;
	}

	public String[] getAdd() {
		return add;
	}

	public void setAdd(String[] add) {
		this.add = add;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	
}
