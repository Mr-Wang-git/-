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
		System.out.println("�ƶ��У���ǰ�ٶ�Ϊ"+this.speed);
	}
	public void Jiaspeed(double  s) {
		this.speed += s;
		System.out.println("���ٺ��ٶ�Ϊ"+this.speed);
	}
	public void Jiangspeed(double  s) {
		this.speed -= s;
		System.out.println("���ٺ��ٶ�Ϊ"+this.speed);
	}
	public void setSpeed(double  s) {
		this.speed = s;
		System.out.println("�������ٺ��ٶ�Ϊ"+this.speed);
	}
	public void type(){
		this.speed = 100;
		this.type = "����";
		System.out.println("����Ϊ"+this.type+"  ����Ϊ"+this.speed);
	}
}
