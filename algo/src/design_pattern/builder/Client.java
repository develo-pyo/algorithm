package design_pattern.builder;

public class Client {

	public static void main(String[] args) {
		
		//1. �ڷ�������
		CoordinateTelescoping c1 = new CoordinateTelescoping(10, 10, 0, 0);

		//2. �ڹٺ�
		CoordinateJavaBean c2 = new CoordinateJavaBean();
		c2.setX(100);
		
		//3. ����
		//��ü�� �ʼ� �Ű������� ���� �����ڷ� ���,
		//������ �����ʵ�� setter �޼ҵ� ���
		CoordinateBuilder c3 = new CoordinateBuilder.Builder(1000, 1000).w(100).h(100).build();
		
	}
}
