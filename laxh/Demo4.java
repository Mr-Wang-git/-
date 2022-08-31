package cn.com.laxh;

public class Demo4 {
	public static void main(String[] args) {
		String str = "ahsdfasdwfgsfgtdfk";
		char x;
		for (int i = 0; i < str.length(); i++) { 
			  x = str.charAt(i);
			if (str.indexOf(x) == i) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == str.charAt(i)) {
						count++;
					}
				}
				System.out.println(x + "出现了" + count + "次");
			}
		}
		
		 
	}
}
