package cn.com.laxh;

public class Demo2 {

	public static void main(String[] args) {
		String str = "aassddff;ffddssaa";
		String SS = "aa";
		int x = str.indexOf(SS);
		if(x>=0) {
			x = str.indexOf(SS);
			int y = str.lastIndexOf(SS);
			System.out.println(x+"   "+y);
		}else {
			System.out.println("找不到此子串");
		}
		
		
		

	}

}
