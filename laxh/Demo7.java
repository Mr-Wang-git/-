package cn.com.laxh;

public class Demo7 {

	public static void main(String[] args) {
		// t1();
		// t2();
		// t3();
		// t4();
		// t5();
		t6();
	}

	public static void t1() {
		String str1 = "asdfasghasofpf";
		String str2 = "asdasdffasghasoasdfpf";
		String s1 = str1.substring(11, 13);
		String s2 = str2.substring(18, 20);
		if (s1.equals(s2)) {
			System.out.println("两个子串相同");
		} else {
			System.out.println("两个子串不相同");
		}
	}

	public static void t2() {
		String str = "asdfasjlkghwqaknfzkjxbsdfasdf";
		String str1 = "jkl";
		if (str.contains(str1)) {
			for (int i = 0; i < str.length() - str1.length() - 1; i++) {
				if (str1.equals(str.substring(i, i + str1.length()))) {
					System.out.println(str1 + " " + i);
				}
			}
		} else {
			System.out.println("不包含此子串");
		}

	}

	public static void t3() {
		String str = "1234564875479078505789";
		int num;
		for (int i = 0; i <= 9; i++) {
			num = 0;
			for (int j = 0; j < str.length(); j++) {
				if (String.valueOf(str.charAt(j)).equals(i + "")) {
					num++;
				}
			}
			System.out.println(i + "--------" + num);
		}
	}

	public static void t4() {
		String str = "akhsdfioqwuejzbahfdad";
		int num;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				num = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						num++;
					}
				}
				System.out.println(str.charAt(i) + "  */*/*/*/*  " + num);
			}
		}
	}

	public static void t5() {
		String x = "aaffaa";
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

	public static void t6() {
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
