package cn.com;

public class Circle {
	public static void main(String[] args) {
		Circle b = new Circle();
		System.out.println(b.method1());
		System.out.println(b.method2());
	}
	private final double PI = Math.PI;
	private int r;
	public double method1() {
		double c = 2*PI*r;
		return c;
	}
	public double method2() {
		double c = PI*(r*r);
		return c;
	}
		
	public void setR(int r) {
		this.r = r;
	}
		
	public Circle() {
		this.r = 4;
	}
	
}
