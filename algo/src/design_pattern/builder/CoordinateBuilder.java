package design_pattern.builder;

public class CoordinateBuilder {
	//���� ����
	//Builder pattern : �ڷ������� ���� + �ڹٺ� ����
	//��ü�� �ʼ� �Ű������� ���� �����ڷ� ���,
	//������ �����ʵ�� setter �޼ҵ� ���
	//������ build �޼ҵ� ȣ���Ͽ� �Һ� ��ü ����
	private final int x;
	private final int y;
	private final int w;
	private final int h;
	
	public static class Builder {
		private final int x;
		private final int y;
		private int w;
		private int h;
		
		public Builder(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Builder w(int w) {
			this.w = w;
			return this;
		}
		
		public Builder h(int h) {
			this.h = h;
			return this;
		}
		
		public CoordinateBuilder build() {
			return new CoordinateBuilder(this);
		}
	}
	
	public CoordinateBuilder(Builder builder) {
		x = builder.x;
		y = builder.y;
		w = builder.w;
		h = builder.h;
	}
	
}
