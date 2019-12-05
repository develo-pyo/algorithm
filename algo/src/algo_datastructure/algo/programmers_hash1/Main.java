package algo_datastructure.algo.programmers_hash1;

import java.util.Arrays;
import java.util.Stack;

public class Main {
	//���α׷��ӽ� > �ؽ� > �������� ���� ���� 
	public static void main(String[] args) {
		String[] part = {"a", "b", "b", "c"};
		String[] comp = {"a", "b", "b"};
		System.out.println(solu(part, comp));
	}
	
	//���� Ǯ��
	private static String solu(String[] part, String[] comp) {
		String result = "";
		Arrays.sort(part);
		Arrays.sort(comp);
		print(comp);
		print(comp);
		
		for(int i=0; i<comp.length; i++) {
			if(!part[i].equalsIgnoreCase(comp[i])){
				result = part[i];
			}
		}
		
		if(result.isEmpty())result=part[part.length-1];
		return result;
	}
	
	//����� Ǯ��
	private static String solu2(String[] part, String[] comp) {
		Arrays.sort(part);
		Arrays.sort(comp);
		print(comp);
		print(comp);
		
		int i=0;	//for ���� index �� ������ ���� ���..
		for(i=0; i<comp.length; i++) {
			if(!part[i].equalsIgnoreCase(comp[i])){
				return part[i];
			}
		}
		return part[i];
	}
	
	private static void print(String[] input) {
		for(String i : input) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
