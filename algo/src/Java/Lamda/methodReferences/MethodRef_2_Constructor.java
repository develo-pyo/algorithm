package Java.Lamda.methodReferences;

import java.util.ArrayList;
import java.util.List;

public class MethodRef_2_Constructor {
	/**
	 * 2
	 * ������ �޼ҵ� ����
	 * �޼ҵ� ������ �Ű������� ���� �� ���� Ÿ���� �˾Ƴ��� ���ٽĿ� ���ʿ��� �Ű� ������ �����ϱ� ����
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 2. ������ ���� */
//		String::new ��
//		() -> new String() �� ����
		
		Sample s = new MethodRef_2_Constructor().new Sample();
		List<Object> list = new ArrayList<Object>();
		s.initialize(list, String::new);	//������ �޼ҵ带 ����.. new String()
		
		
		
		
		Factory<Person> factory = () -> new Person("pyo");
		
		Sample sample = new MethodRef_2_Constructor().new Sample();
		List<Person> personList = new ArrayList<Person>();
		sample.initialize(personList, factory);
		
		System.out.println(personList.get(0).getName());
		
	}
	
	
	@FunctionalInterface
	interface Factory<T> {
		T create();
	}
	
	class Sample{
		public <T> void initialize(List<T> list, Factory<T> factory) {
			list.add(factory.create());
		}
	}
}
