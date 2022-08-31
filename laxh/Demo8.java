package cn.com.laxh;

public class Demo8 {

	public static void main(String[] args) {
		// t1();
		// t2();
		// t3();
		// t4();
		// t5();
		// t6();
		t7();
	}

	public static void t1() {
		System.out.println("-*********1***********-");
		String str = "study hard make progress everyday";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			char cha = str.charAt(i);
			if (cha == 's') {
				num++;
			}
		}
		System.out.println("s出现了" + num);
		System.out.println("-*********2***********-");
		String[] str1 = str.split(" ");
		System.out.println(str1[2]);
		System.out.println("-*********3***********-");
		for (int j = 0; j < str1.length; j++) {
			System.out.println(str1[j]);
		}
		System.out.println("-*********4***********-");

		str = "study hard make progress everyday";
		String[] arr = str.split(" ");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			String[] ss = arr[i].split("");
			ss[0] = ss[0].toUpperCase();
			String s = "";
			for (int j = 0; j < ss.length; j++) {
				s += ss[j];
			}
			result += s + " ";
		}
		System.out.println(result);

		System.out.println("-**********5**********-");
		str = "study hard make progress everyday";
		String[] Xs = str.split("");
		String xa = "";
		for (int i = str.length() - 1; i >= 0; i--) {// 倒输出
			xa += Xs[i];
		}
		System.out.println(xa);
	}

	// 2.用正则表达式检验email地址
	public static void t2() {
		String regex = "[A-z0-9]{1,}+@[A-z0-9]+.[A-z]+";
		String str = "254asdf1125@163.com";
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}

	// 用正则表达式求出只能由26个英文字母组成的字符串
	public static void t3() {
		String regex = "^[a-zA-z]+";
		String str = "AasdSaadfDFAGWawea";
		boolean flag = str.matches(regex);
		System.out.println(flag);

	}

	// 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
	public static void t4() {
		String str = "ashdfiojASDFASDGF213415#$!$%%$&!";
		int Da = 0;
		int Xiao = 0;
		int Shu = 0;
		for (int x = 0; x < str.length(); x++) {
			char cha = str.charAt(x);
			if (cha >= 'A' && cha <= 'Z') {
				Da++;
			} else if (cha >= 'a' && cha <= 'z') {
				Xiao++;
			} else if (cha >= '0' && cha <= '9') {
				Shu++;
			}
		}
		System.out.println("大写字符：" + Da + "个");
		System.out.println("小写字符：" + Xiao + "个");
		System.out.println("数字字符：" + Shu + "个");
	}

	// 利用正则表达式判断一个字符串是否是一个qq邮箱
	public static void t5() {
		String regex = "[1-9][0-9]{4,}+@qq+.com+";
		String str = "2356097973@qq.com";
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}

	// 将以下字符串按逗号分割，将得到的字符串数组转化为int数组，从小到大排序，遍历输出。字符串如下："120,11,32,135,234,91,18"
	public static void t6() {
		String str = "120,11,32,135,234,91,18";
		String[] arr = str.split(",");
		int[] aee = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			aee[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < aee.length - 1; i++) {
			for (int j = 0; j < aee.length - 1; j++) {
				if (aee[j] > aee[j + 1]) {
					int t = aee[j + 1];
					aee[j + 1] = aee[j];
					aee[j] = t;
				}
			}
		}
		for (int i = 0; i < aee.length; i++) {
			System.out.print(aee[i] + " ");
		}

	}

	public static void t7() {
		String str = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu ?";
		String[] arry = str.split(" ");
		int count = 0;
		for (int i = 0; i < arry.length; i++) {
			String[] arr = arry[i].split(",");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].length() == 3) {
					count++;
					System.out.print(arr[j] + "----");
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
