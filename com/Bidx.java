package cn.com;

public class Bidx {
	
	public static void main(String[] args) {
		Demo1 a = new Demo1();
		a.Dinyi(50);
		a.guess();
	}

}
class Demo1{
	private int v = 100;
	private int num;
	
	public void guess() {
		if( num > v ) {
			System.out.println("num����v");
		}else if( num < v ) {
			System.out.println("numС��v");
		}else {
			System.out.println("�²�ɹ�");
		}
	}

	public void Dinyi(int num) {
		this.num = num;
	}
	
}

