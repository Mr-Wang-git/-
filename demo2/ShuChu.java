package cn.com.demo2;

public class ShuChu {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("形状的名称为:"+circle.getName());
		circle.R(9);
		System.out.println(circle.getName()+"的面积为:"+circle.jisuan());
	}
	
	
}
