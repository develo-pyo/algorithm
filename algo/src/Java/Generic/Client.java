package Java.Generic;

public class Client {
	public static void main(String[] args) {
		
//		Cart<Product> cart1 = new Cart<>();
//		Product p = new Product();
//		p.setProduct("�ٰ���");
//		cart1.setItem(p);
//		
//		Cart<String> cart2 = new Cart<>();
//		cart2.setItem("����");
//		
//		Cart<Fruit> cart3 = new Cart<>();
//		Product p2 = new Fruit();
//		p2.setProduct("���");
//		Product p3 = new Fruit();
//		p3.setProduct("����");
//		cart3.setItem((Fruit)p2);
//		cart3.setItem((Fruit)p3);
//		
//		int totalSize = Calculator.add3(cart1, cart2, cart3);
//		System.out.println(totalSize);
		
		
		Cart<Food> cart1 = new Cart<>();
		Calculator.add1(cart1, cart1, cart1);
		
		
		Cart<Fruit> cart2 = new Cart<>();
		Calculator.add1(cart2, cart2, cart2);
		
		
//		Cart<Fruit> cart3 = new Cart<>();
//		Cart<Food> cart4 = new Cart<>();
//		Calculator.add1(cart3, cart3, cart4);	//compile error, cart3 �� ���� .add�� Ÿ���Ķ���ʹ� Fruit ���� ���������� cart4 Food �� �Ű������� �Ѿ���Ƿ� error �߻�
		
		
	}
}