package cn.com;

public abstract class Role {
	private String name;
	private String sex;
	private int age;

	abstract void play();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Role() {
		super();
		this.name = "张三";
		this.sex = "男";
		this.age = 18;
	}

	public Role(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

}

class Employee extends Role {
	private int salary;
	private static int bhid;

	@Override
	public void play() {
		System.out.println("play覆盖方法1");
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	public Employee(String name, String sex, int age, int salary) {
		super(name, sex, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getBhid() {
		return bhid;
	}

	public static void setBhid(int bhid) {
		Employee.bhid = bhid;
	}
}

class Manager extends Employee {
	private final int vehicle;

	public Manager(int salary, int vehicle) {
		super(salary);
		this.vehicle = vehicle;
	}

	@Override
	public void play() {
		System.out.println("play覆盖方法2");
	}
}
