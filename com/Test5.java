package cn.com;

public class Test5 {
	public static void main(String[] ages) {
		MyTime t = new MyTime(8, 30, 20);
		t.display();

		t.subHour(1);// ��
		t.subMinute(30);
		t.subSecond(20);
		t.display();

		t.addHour(1);// ��
		t.addMinute(60);
		t.addSecond(20);
		t.display();
	}
}
