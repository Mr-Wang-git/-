package cn.com.demo1;

public class Shuxing {
	String Name;
	int Age;

	public Shuxing(String name, int age) {
		super();
		Name = name;
		Age = age;
	}

	public void Qian(int x) {
		System.out.println("Ա����=" + Name + "\t����=" + Age + "\t����Ϊ" + x);

	}

	public void Qian(boolean flag, int x,int j) {
		if(flag) {
			System.out.println("�Ƿ����Ŀ��"+ flag +"\t������=" + Name + "\t����=" + Age + "\t����Ϊ" +  x + "\t����Ϊ" + j);
		}else{
			System.out.println("�Ƿ����Ŀ��"+ flag +"\t������=" + Name + "\t����=" + Age + "\t����Ϊ" + x );
		}
		
	}


}
