package cn.com.laxh;

public class Demo1 {

	public static void main(String[] args) {
		String str1 = "asdfasghasofpf";
		String str2 = "asdasdffasghasoasdfpf";
		String s1 = str1.substring(11, 13);
		String s2 = str2.substring(18, 20);
		if (s1.equals(s2)) {
			System.out.println("�����Ӵ���ͬ");
		} else {
			System.out.println("�����Ӵ�����ͬ");
		}

	}

}
