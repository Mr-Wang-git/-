package cn.com.demo2;

public class ShuChu {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("��״������Ϊ:"+circle.getName());
		circle.R(9);
		System.out.println(circle.getName()+"�����Ϊ:"+circle.jisuan());
	}
	
	
}
