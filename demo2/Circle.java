package cn.com.demo2;

public class Circle extends Abs{
	double r;
	public double R(double r) {
		return this.r = r;
	}
		
	@Override
	public double jisuan() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(r, 2));	
	}
	

}

