package design_pattern.builder;

public class CoordinateJavaBean {
	//�ڹ� �� ����
	//java bean pattern
	
	//���� : ��ü ������ �����ϸ� �������� ����
	//���� : �ڵ尡 ��
	//ġ������ ���� : ��ü�� �����ϰ� �����Ǿ����� ���� �Ұ�(����(freezing) ���� �Ұ�)
	//  ex : x, y �� ���� w, h ���� ������ ��ü ���� ����
	
	private int x=0;
	private int y=0;
	private int w=0;
	private int h=0;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	
}
