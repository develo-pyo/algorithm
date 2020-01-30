package design_pattern.factory.factory2;

public class LGComputer implements Computer {
	public LGComputer() {
		System.out.println("LG ��ǻ�� ����");
	}
	
	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}
	
	public LGMouse createMouse() {
		return new LGMouse();
	}
}
