package cn.com.cljb;

public class Demo1 {
	public static void main(String[] args) {
		t1();
		t2();
		t3();
		t4();
		t5();
		t6();
		t7();
	}
	/*1.定义一个数组,数组成员10个,
	（1）找出数组中最大数连同下标一起输出
	（2）求该数组中第二大的数的下标（面试真题）*/
	public static void t1() {
		int[] arr = new int[] {10,20,30,40,500,60,700,80,900,100};
		int max = 0;
		int XiaBiao = 0;
		int er = arr[0];
		
		
		int erXia  = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr[j + 1]) {
					max = arr[j + 1];
					XiaBiao =  j + 1;
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
				for (int j = 0; j < arr.length-1; j++) {
					if (er < arr[j+1] && arr[j+1] != max) {
						er = arr[j+1];
						erXia = j+1;
					}
				}
			}
		System.out.println( max + "是最大值下标为" + XiaBiao);
		System.out.print(er +  "是第二大的值下标为" + erXia);
	}
	/*2.B哥去参加青年歌手大奖赛,有10个评委打分,(去掉一个最高一个最低)求平均分?（面试真题）*/
	public static void t2() {
		double[] arr = new double[] {10.6,20,30,40.68,50,60,70,80,90,100.5};
		double max = 0;
		double low = arr[0];
		for(int i =0;i<arr.length;i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr[j + 1]) {
					max = arr[j + 1];
				}
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			if(low > arr[i]) {
				low = arr[i];
			}
		}
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=max&&arr[i]!=low) {
			 sum += arr[i];
			}
		}
		System.out.println(sum/arr.length-2);
	}
	/*3.定义一个长度为10的int数组,统计数组中的最大值、最小值、以及奇数和偶数的个数（面试真题）*/
	public static void t3() {
		int[] arr = new int[] {10,20,30,4,8,5,6,9,7,90};
		int max = 0;
		int low = arr[0];
		int ou = 0;
		int ji = 0;
		for (int i = 0; i < arr.length; i++) {//最大数
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr[j + 1]) {
					max = arr[j + 1];
				}
			}
		}
		for(int i =0;i<arr.length;i++) {//最小数
			if(low > arr[i]) {
				low = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				ou++;
			}else {
				ji++;
			}
		}
		System.out.println(max +"是最大值");
		System.out.println(low +"是最小值");
		System.out.println("有"+ ou +"个偶数");
		System.out.println("有"+ ji +"个奇数");
		
	}
	/*4.现在有如下的一个数组：int?oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}?;?
			要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
			int?newArr[]={1,3,4,5,6,6,5,4,7,6,7,5}?;?*/
	public static void t4() {
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int len = 0 ; 
		for(int i = 0;i<oldArr.length;i++) {
			if(oldArr[i] != 0) {
				len++;
			}
		}
		int[] newArr = new int[len];
		int n = 0;
		for(int i = 0;i<oldArr.length;i++) {
			if(oldArr[i] != 0) {
				newArr[n] = oldArr[i];
				n++;
			}
		}
		for(int i = 0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
	}
	/*5.有两个数组：数组A：{1, 7, 9, 11, 13, 15, 17, 19}
		数组B：{2, 4, 6, 8, 10}
	将两个数组合并为数组C，按升序排列。（面试真题）*/
	public static void t5() {
		int[] a = {1, 7, 9, 11, 13, 15, 17, 19};
		int[] b = {2, 4, 6, 8, 10};
		int[] c = new int[a.length+b.length];
		int n = 0;
		int d = 0;
		for(int i = 0;i < a.length; i++) {
			c[n] += a[i];
			n++;
			d = n;
		}
		for(int i = 0; i <b.length;i++) {
			c[d] += b[i];
			d++;
		}
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] > c[j + 1]) {
					int t = c[j + 1];
					c[j + 1] = c[j];
					c[j] = t;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
	/*6.定义一个无参带返回值的方法，实现输出学生年龄的最大值
	提示：
 	1、 定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
 	2、 定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
 	3、 使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
 	4、 使用 return 返回最大值*/
	public static int t6() {
		int[] ages = {18,23,21,19,25,29,17};
		int max = ages[0];
		for(int i =0;i<ages.length;i++) {//最大数
			if(max < ages[i]) {
				max = ages[i];
			}
		}
		System.out.println(max);
		return max;
	}
	/*7.对一维数组进行删改：int[] num = new int[10]; （面试真题）
	要求：用方法实现 
	1.删除指定位置上的数 
	2.修改指定位置上的数 */
	public static void t7() {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		num = t71(num,3);
		//t72(num,3,44);
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}
	public static int[] t71(int[] num,int dex) {
		int[] arr = new int[num.length - 1];
		int n = 0;
		for(int i=0;i<num.length;i++) {
			if(i!=dex) {
				arr[n] = num[i];
				n++;
			}
		}
		return arr;
	}
	public static void t72(int[] num,int dex,int value) {
		num[dex] = value;
	}

}