package cn.com.laxh;

public class Demo5 {
	public static void main(String[] args) {
		String x = "aaf4faa";
		String[] Xs = x.split("");
		String xa = "";
		int len = x.length();
		for (int i = len - 1; i >= 0; i--) {// �����
			xa += Xs[i];
			System.out.println(xa);
		}
		if (x.equals(xa)) {
			System.out.println("�Գ�");
		} else {
			System.out.println("���Գ�");
		}
	}
}
