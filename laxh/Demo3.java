package cn.com.laxh;

public class Demo3 {

	public static void main(String[] args) {
		String num = "11111546746876735464563467800024";
		for (int i = 0; i < num.length(); i++) { 
			 char x = num.charAt(i);
			if (num.indexOf(x) == i) {
				int count = 0;
				for (int j = 0; j < num.length(); j++) {
					if (num.charAt(j) == num.charAt(i)) {
						count++;
					}
				}
				System.out.println(num.charAt(i) + "出现了" + count + "次");
			}
		}
	}
}
