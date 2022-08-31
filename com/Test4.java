package cn.com;

public class Test4 {

	public static void main(String[] args) {
		
			Employee d1 = new Employee("½ğÎÄÁú", "Å®", 10, 60);
			System.out.println(d1.getAge());
			System.out.println(d1.getName());
			
			Manager d2 = new Manager(100,60);
			System.out.println(d2.getAge());
			System.out.println(d2.getName());

	}

}
