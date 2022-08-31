package cn.com.demo3;

public class Type {
	double money;
	String brand;
	
	public Type(double money, String brand) {
		super();
		this.money = money;
		this.brand = brand;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
