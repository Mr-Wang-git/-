package cn.com.laxh;

public class Demo5 {
	public static void main(String[] args) {
		String x = "aaf4faa";
		String[] Xs = x.split("");
		String xa = "";
		int len = x.length();
		for (int i = len - 1; i >= 0; i--) {// 倒输出
			xa += Xs[i];
			System.out.println(xa);
		}
		if (x.equals(xa)) {
			System.out.println("对称");
		} else {
			System.out.println("不对称");
		}
	}
}
