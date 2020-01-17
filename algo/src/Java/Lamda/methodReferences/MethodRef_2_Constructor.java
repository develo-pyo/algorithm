package Java.Lamda.methodReferences;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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
		
//		Sample s = new MethodRef_2_Constructor().new Sample();
//		List<Object> list = new ArrayList<Object>();
//		s.initialize(list, String::new);	//������ �޼ҵ带 ����.. new String()
//		
//		
//		Factory<Person> factory = () -> new Person("pyo");
//		
//		Sample sample = new MethodRef_2_Constructor().new Sample();
//		List<Person> personList = new ArrayList<Person>();
//		sample.initialize(personList, factory);
//		
//		System.out.println(personList.get(0).getName());
		
		Func<String, Person> func1 = Person::new;
		Person person = func1.create("pyo");
		System.out.println(person.getName());
		
		Func2<String, String, Person> func2 = Person::new;
		Person person2 = func2.create("pyo", "male");
		System.out.println(person2.getName() + "/" + person2.getGender());
	}
	
	@FunctionalInterface
	interface Func<T, R>{
		R create(T t);
	}
	@FunctionalInterface
	interface Func2<T, U, R>{
		R create(T t, U u);
	}
	
	@FunctionalInterface
	interface Factory<T> {
		T create();
	}
	
	class Sample{
		public void initialize(List list, Factory factory) {
			list.add(factory.create());
		}
	}
}
