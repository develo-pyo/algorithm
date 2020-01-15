package Java.Lamda.basic;

public class Main4 {
	
	//java lamda
	//jdk 1.8~
	//�Լ��� ���α׷���
	//�������̽� + �͸�ü + ���ٽ�
	//1ȸ�� �͸� �޼ҵ尡 �ʿ��� �� ���ٸ� ��� 
	
	//���� https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
	public static void main(String[] args) {
		
		Calculation add = (x, y) -> {
			return x+y;
		};
		add.print(2, 3);
		Calculation.print2(2, 3);
		System.out.println(calculate(add, 2, 3));
		
		
		ExtendsCalculation multiply = (x, y) -> x*y; 
		multiply.print(2, 3);
		System.out.println(calculate(multiply, 2, 3));
		
	}
	
	static Integer calculate(Calculation operation, Integer x, Integer y) {
		return operation.apply(x, y);
	}
	
	//@FunctionalInterface �� abstract method �� ���� 1������ �Ѵ�.
	//�������̽��� default �޼ҵ尡 �߰��Ǹ鼭 java�� ���߻���� �������� ���̴�
	//�߻�Ŭ������ �ٸ��� : �ν��Ͻ� ������ ���� �� ����, ���߻��(extends)�� �ƴ� ���߱���(implements)
	@FunctionalInterface
	interface Calculation {
		Integer apply(Integer x, Integer y);
		
		//default �޼ҵ�� ���� (�������̽��� �߻� �޼ҵ尡 �ƴ� �޼ҵ带 ���� �� �ִٴ�..!)
		default void print(Integer x, Integer y) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}
		
		//static �޼ҵ�� ���� (�������̽��� �߻� �޼ҵ尡 �ƴ� �޼ҵ带 ���� �� �ִٴ�..!)
		static void print2(Integer x, Integer y) {
			System.out.println("x : " + x + ", y : " + y);
		}
		
		//Comparator interface �� ���������� compare �� �߻�޼ҵ��� ��, ������ �޼ҵ���� ���� default �� static �޼ҵ��̴�.
		//1.7 ���Ͽ����� Comparator ���� ���ʿ� �߻� �޼ҵ常 ����(1.7 ���Ͽ� �������̽����� default �޼ҵ�, static �޼ҵ� ��ü�� ������ ����)
		//1.8 ������ Comparator �� default �޼ҵ� �� static �޼ҵ� �ټ� ���� but �߻�޼ҵ�� �� �� ��( compare() )
	}
	
	class Calculator {
		Integer add(Calculation cal, Integer x, Integer y) {
			return cal.apply(x, y);
		}
	}
	
	@FunctionalInterface
	interface ExtendsCalculation extends Calculation{
		//default �޼ҵ�� �������̵��� �����ϴ�
		//static �޼ҵ�� �������̵��� �Ұ�
		@Override
		default void print(Integer x, Integer y){
			System.out.println("x,y : " + x +","+ y);
		}
	}
	
}
