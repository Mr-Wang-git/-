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
		System.out.println("员工名=" + Name + "\t年龄=" + Age + "\t工资为" + x);

	}

	public void Qian(boolean flag, int x,int j) {
		if(flag) {
			System.out.println("是否完成目标"+ flag +"\t经理名=" + Name + "\t年龄=" + Age + "\t工资为" +  x + "\t奖金为" + j);
		}else{
			System.out.println("是否完成目标"+ flag +"\t经理名=" + Name + "\t年龄=" + Age + "\t工资为" + x );
		}
		
	}


}
