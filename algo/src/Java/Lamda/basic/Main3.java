package Java.Lamda.basic;

public class Main3 {
	
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
		System.out.println(calculate(add, 2, 3));
		
		
		Calculation multiply = (x, y) -> x*y;
		System.out.println(calculate(multiply, 2, 3));
	}
	
	static Integer calculate(Calculation operation, Integer x, Integer y) {
		return operation.apply(x, y);
	}
	
	//@FunctionalInterface �� abstract method �� ���� 1������ �Ѵ�.
	@FunctionalInterface
	interface Calculation {
		Integer apply(Integer x, Integer y);
	}
	
	class Calculator {
		Integer add(Calculation cal, Integer x, Integer y) {
			return cal.apply(x, y);
		}
	}
	
	
	
	
}
