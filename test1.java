package com.cn.warn;

import java.util.Random;

import javax.rmi.CORBA.Util;

public class test1 {
	public static void main(String[] args) {
	//	test001();
	//	test002();
		test003();
	}
	
	public static void test001() {
		for(int i = 1;i<=9;i++) {
			for(int j = i;j<=9;j++) {
				int sum = i * j;
				System.out.print("i*j="+sum);
				
			}
			System.out.println();
			
		}
	}
	public static void test002() {
		//int 32λ
		//long 64λ
		System.out.println(1 << 3);
		System.out.println(1 << 35);
	}
	
	public static void test003() {
		int N = 1000;
		int[] arr = new int[N];
		for(int i  = 0 ;i<= arr.length-1;i++) {
			arr[i] = i + 1;
		}
		arr[arr.length - 1 ]= new Random().nextInt(N-1)+1;
		int index = new Random().nextInt(N);
		//Util.(arr,index,arr.length-1);
		helper[arr[i]]++;
		for(int a = 0 ;a <arr.length;a++) {
			System.out.print(arr[a]);
			System.out.println();
			
		}
		
		
		
		
	}
	
}
