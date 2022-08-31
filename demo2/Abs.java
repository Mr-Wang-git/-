package cn.com.demo2;

public abstract class Abs extends ShuChu {
	public String getName() {
		return this.getClass().getSimpleName();
		
	}
	public abstract double jisuan();
	
}
