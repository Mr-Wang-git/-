package cn.com.demo4;

public class Test {

	public static void main(String[] args) {
		OverReadDouble num1 = new OverReadDouble(6666);
		OverReadDouble num2 = new OverReadDouble(6666);
		System.out.println(num1.equals(num2));
	}

}
