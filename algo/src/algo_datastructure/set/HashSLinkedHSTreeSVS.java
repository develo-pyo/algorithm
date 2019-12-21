package algo_datastructure.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSLinkedHSTreeSVS {

	private static long START_TIME = 0;
	private static long END_TIME = 0;
	
	public static void main(String[] args) {
		//HashSet > linkedHashSet > treeSet ������� ������ ����(HashSet�� ���� ����, �޸� ���Ի��)
		
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		setStartTime();
		for(int i=0; i<10000; i++) {
			hashSet.add(i);
		}
		setEndTime();
		printDuration();

		
		setStartTime();
		for(int i=0; i<10000; i++) {
			linkedHashSet.add(i);
		}
		setEndTime();
		printDuration();
		
		
		setStartTime();
		for(int i=0; i<10000; i++) {
			treeSet.add(i);
		}
		setEndTime();
		printDuration();
		
		System.out.println("-------------------------------------------------");
		
	}
	
	private static void setStartTime() {
		START_TIME = System.nanoTime();
	}
	
	private static void setEndTime() {
		END_TIME = System.nanoTime();
	}
	
	private static void printDuration() {
		System.out.println(END_TIME - START_TIME);
	}
}
