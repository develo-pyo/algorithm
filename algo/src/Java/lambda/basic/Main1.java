package Java.lambda.basic;

public class Main1 {
	
	//java lambda
	//jdk 1.8~
	//�Լ��� ���α׷���
	//�������̽� + �͸�ü + ���ٽ�
	//1ȸ�� �͸� �޼ҵ尡 �ʿ��� �� ���ٸ� ��� 
	
	//���� https://futurecreator.github.io/2018/07/20/java-lambda-type-inference-functional-interface/
	public static void main(String[] args) {

		//���� �͸�ü�� ����� ���� ���
		Interface i = new Interface() {
			@Override
			public void sayHello() {
				System.out.println("HELLO! in anonymous class");
			}
		};
		i.sayHello();
		
		//lamda �� Functional Interface ���� ����� �����ϴ�
		Interface lamda = () -> {
			System.out.println("HELLO! in anonymous method(lambda)");
		};
		lamda.sayHello();
	}
	
	//@FunctionalInterface �� abstract method �� ���� 1������ �Ѵ�.
	@FunctionalInterface
	interface Interface {
		void sayHello();
	}
}
