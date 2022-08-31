package cn.com.laxh;

public class demo6 {

	public static void main(String[] args) {
		String s = "name=zhangsan age=18 classNo=090728";
		String[] str = s.split(" ");
		String[] str1 = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			String a = str[i];
			str1[i] = a.split("=")[1];
			System.out.println(str1[i]);

		}
	}

}
