package design_pattern.builder;

public class CoordinateTelescoping {
	//�ڷ������� ������ ����
	//Telescoping constructor
	//���� :
	//�ʼ� ���� �ʵ带 ������ �Ѱܾ� �Ѵٴ� ����
	//�Ű����� ������ �ڵ� ���ſ����� ����
	private final int x;
	private final int y;
	private int w;
	private int h;
	
	public CoordinateTelescoping(int x, int y) {
		this(x, y, 0, 0);
	}
	public CoordinateTelescoping(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
}
