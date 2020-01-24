package algo_programmers;

import java.util.Arrays;
import java.util.Stack;

public class SkillTest2_3 {
//	���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� �����Ϸ��� �մϴ�. ����Ʈ�� �۾Ƽ� �� ���� �ִ� 2�� �ۿ� Ż �� ����, ���� ���ѵ� �ֽ��ϴ�.
	public static void main(String[] args) {
		//10 20 30 30 80 90 100
		int[] people = {10, 10, 20, 30, 30, 40, 100}; 
		int limit = 100;
		int cnt = 0;
        int j = 0;
        Arrays.sort(people);
        
        
        // i    j    cnt
        // 6    0     0
        // 5    0     1         
        // 4    1     2
        // 3    1     1
        
        for(int i = people.length-1; i > j; i--) {
        	System.out.println(people[i]+"/"+people[j]);
        	System.out.println(people[i] + people[j] <= limit);
        	if(people[i] + people[j] <= limit) {
        		cnt++; 
        		j++;
        	}        		      	
        }
        
        
		System.out.println(people.length - cnt);
	}
}
