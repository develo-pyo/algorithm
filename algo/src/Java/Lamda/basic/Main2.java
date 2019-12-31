package Java.Lamda.basic;

public class Main2 {
	
	//java lamda
	//jdk 1.8~
	//�Լ��� ���α׷���
	//�������̽� + �͸�ü + ���ٽ�
	//1ȸ�� �͸� �޼ҵ尡 �ʿ��� �� ���ٸ� ��� 
	
	//���� https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		Calculation add = new Calculation() {
			@Override
			public Integer apply(Integer x, Integer y) {
				return x+y;
			}
		};
		System.out.println(cal.calculate(add));
		
		
		Calculation multiply = (x, y) -> {
			return x * y;
		};
		System.out.println(cal.calculate(multiply));
	}
	
	//@FunctionalInterface �� abstract method �� ���� 1������ �Ѵ�.
	@FunctionalInterface
	interface Calculation {
		Integer apply(Integer x, Integer y);
	}
	
	static class Calculator {
		Integer calculate(Calculation cal) {
			return cal.apply(2, 3);
		}
	}
	
	
}
