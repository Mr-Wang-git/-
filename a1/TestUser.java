package com.cn.a1;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User n1 = new User( 12 , "zs");
		User n2 = new User( 12 , "zs");
		System.out.println(n1.equals(n2));
		//java.lang.reflect.Field[] f = n1.getClass().getDeclaredFields();
		//System.out.println();
	}

}
