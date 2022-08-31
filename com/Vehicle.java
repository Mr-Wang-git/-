package cn.com;

public class Vehicle {
	public static void main(String[] args) {
		Vehicle c = new Vehicle();
		c.move();       
		c.setSpeed(120);
		c.Jiaspeed(40);  
		c.Jiangspeed(60);
	}
	
	private double  speed;
	private String type;
	
	public void move() {
		System.out.println("移动中：当前速度为"+this.speed);
	}
	public void Jiaspeed(double  s) {
		this.speed += s;
		System.out.println("加速后速度为"+this.speed);
	}
	public void Jiangspeed(double  s) {
		this.speed -= s;
		System.out.println("减速后速度为"+this.speed);
	}
	public void setSpeed(double  s) {
		this.speed = s;
		System.out.println("设置移速后速度为"+this.speed);
	}
	public void type(){
		this.speed = 100;
		this.type = "卡车";
		System.out.println("类型为"+this.type+"  移速为"+this.speed);
	}
}
