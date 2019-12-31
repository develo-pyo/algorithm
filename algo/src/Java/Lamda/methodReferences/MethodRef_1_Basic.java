package Java.Lamda.methodReferences;

public class MethodRef_1_Basic {
	/**
	 * 2
	 * ������ �޼ҵ� ����
	 * �޼ҵ� ������ �Ű������� ���� �� ���� Ÿ���� �˾Ƴ��� ���ٽĿ� ���ʿ��� �Ű� ������ �����ϱ� ����
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 1.�⺻ ���� */
		//String.valueOf() �� �״�� ����Ͽ� �����ϴ� ����
		FuncI funcI = (Object obj) -> String.valueOf(obj);
		System.out.println(funcI.anony("HELLO"));
		
		//�� ��� �Ʒ��� ���� �޼ҵ� ������ ���� 1
		FuncI funcI_ref_method = String::valueOf;
		System.out.println(funcI_ref_method.anony(100));
		
		//�� ��� �Ʒ��� ���� �޼ҵ� ������ ���� 2
		System.out.println(convert(99, String::valueOf));
		
		
		//static �� ���, Ŭ����::�޼ҵ�;
		//�ν��Ͻ� �޼ҵ��� ���, ��������::�޼ҵ�;
		FuncI2 funcI2 = Math::max;	//FuncI2 �Լ��� �������̽��� Math.max ������Ű����
		System.out.println(funcI2.anony(1, 2));
		
		FuncI3 funcI3 = MethodRef_1_Basic::sample;
		System.out.println(funcI3.anony('a'));
		
		
		/** 2. ������ ���� */
		
		
		
		
		/** 3. ����ƽ �޼ҵ� ���� */
		/** 4. �ν��Ͻ� �޼ҵ� ���� */
		/** 5. �ν��Ͻ� �޼ҵ� ���� */
	}

	@FunctionalInterface
	interface FuncI {
		String anony(Object obj);
	}
	
	public static String convert(Integer number, FuncI func) {
		return func.anony(number);
	}
	
	@FunctionalInterface
	interface FuncI2 {
		int anony(int a, int b);
	}
	
	@FunctionalInterface
	interface FuncI3 {
		int anony(Character c);
	}
	
	static int sample(Character c) {
		return (int)c;
	}
}
