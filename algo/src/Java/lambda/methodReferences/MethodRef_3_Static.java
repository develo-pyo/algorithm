package Java.lambda.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodRef_3_Static {
	/**
	 * 2
	 * ������ �޼ҵ� ����
	 * �޼ҵ� ������ �Ű������� ���� �� ���� Ÿ���� �˾Ƴ��� ���ٽĿ� ���ʿ��� �Ű� ������ �����ϱ� ����
	 * https://futurecreator.github.io/2018/08/02/java-lambda-method-references/
	 */
	public static void main(String[] args){
		
		/** 3. ����ƽ �޼ҵ� ���� */
//		Ư�� ����ƽ �޼ҵ� ���� ���� ����
		Integer[] arr = {1, 5, 2, 4, 3};
		
		
		//���� jdk 1.7 ����
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		//���ٽ� ��� jdk 1.8 �̻�
		Arrays.sort(arr, (x, y) -> x-y);
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
		FuncI func = MethodRef_3_Static::toStr;
		System.out.println(func.anony("HELLO LAMBDA!"));
	}
	
	static String toStr(String str) {
		return str.toString();
	}
	
	@FunctionalInterface
	interface FuncI {
		String anony(String str);
	}
	
}
