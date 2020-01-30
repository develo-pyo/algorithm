package design_pattern.factory.factory2;

public class SamsungComputer implements Computer {
	
	public SamsungComputer() {
		System.out.println("SAMSUNG ��ǻ�� ����");
	}
	
	public SamsungKeyboard createKeyboard() {
		return new SamsungKeyboard();
	}
	
	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}
}
