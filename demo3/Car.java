package cn.com.demo3;

public class Car {
	public static void main(String[] args) {
		Type[] car =  kuncun();
		Buycar("Ʒ��3",car);

	}
	public static Type[] kuncun() {
		Type[] car = new Type[5];
		for (int i = 0; i < car.length; i++) {
			car[i] = new Type((Math.ceil(Math.random()*i * 500000)), "Ʒ��" + i);
		}
		return car;
	}
	public static void Buycar(String car, Type[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].getBrand().equals(car)) {
				System.out.println("�û�������" + c[i].getMoney() + "Ԫ��" + c[i].getBrand() + "��");
			}
		}
	}
}
