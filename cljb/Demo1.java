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
	/*1.����һ������,�����Ա10��,
	��1���ҳ��������������ͬ�±�һ�����
	��2����������еڶ���������±꣨�������⣩*/
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
		System.out.println( max + "�����ֵ�±�Ϊ" + XiaBiao);
		System.out.print(er +  "�ǵڶ����ֵ�±�Ϊ" + erXia);
	}
	/*2.B��ȥ�μ�������ִ���,��10����ί���,(ȥ��һ�����һ�����)��ƽ����?���������⣩*/
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
	/*3.����һ������Ϊ10��int����,ͳ�������е����ֵ����Сֵ���Լ�������ż���ĸ������������⣩*/
	public static void t3() {
		int[] arr = new int[] {10,20,30,4,8,5,6,9,7,90};
		int max = 0;
		int low = arr[0];
		int ou = 0;
		int ji = 0;
		for (int i = 0; i < arr.length; i++) {//�����
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr[j + 1]) {
					max = arr[j + 1];
				}
			}
		}
		for(int i =0;i<arr.length;i++) {//��С��
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
		System.out.println(max +"�����ֵ");
		System.out.println(low +"����Сֵ");
		System.out.println("��"+ ou +"��ż��");
		System.out.println("��"+ ji +"������");
		
	}
	/*4.���������µ�һ�����飺int?oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}?;?
			Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��
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
	/*5.���������飺����A��{1, 7, 9, 11, 13, 15, 17, 19}
		����B��{2, 4, 6, 8, 10}
	����������ϲ�Ϊ����C�����������С����������⣩*/
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
	/*6.����һ���޲δ�����ֵ�ķ�����ʵ�����ѧ����������ֵ
	��ʾ��
 	1�� ����һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ 18 ,23 ,21 ,19 ,25 ,29 ,17
 	2�� ����һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
 	3�� ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ
 	4�� ʹ�� return �������ֵ*/
	public static int t6() {
		int[] ages = {18,23,21,19,25,29,17};
		int max = ages[0];
		for(int i =0;i<ages.length;i++) {//�����
			if(max < ages[i]) {
				max = ages[i];
			}
		}
		System.out.println(max);
		return max;
	}
	/*7.��һά�������ɾ�ģ�int[] num = new int[10]; ���������⣩
	Ҫ���÷���ʵ�� 
	1.ɾ��ָ��λ���ϵ��� 
	2.�޸�ָ��λ���ϵ��� */
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