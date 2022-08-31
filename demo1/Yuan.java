package cn.com.demo1;

public class Yuan extends Shuxing{

	public Yuan(String name, int age) {
		super(name, age);
	}

	public static void main(String[] args) {
		Shuxing Zhiyuan = new Shuxing("½ğÎÄÁú",18);
		Zhiyuan.Qian(1000);
		
		Shuxing Jinli = new Shuxing("ĞìºéÌÎ",18);
		Jinli.Qian(true,3000,2000);
	}

}
