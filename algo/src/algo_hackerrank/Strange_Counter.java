package algo;

import java.util.ArrayList;
import java.util.List;

public class Strange_Counter {

	public static void main(String[] args) {

		//a : �ʱ� �迭
        //k : �̵� Ƚ��
        //q : ����� ���� �迭�� �ε���
		int[] a = {1, 2, 3};
		int k = 2;
		int[] q = {0, 1, 2};
		
		//���
		int[] result = new int[q.length];
		

		//�м�
        //         1 2 3 4
		//		 4 1 2 3
		//	   3 4 1 2         
		//	 2 3 4 1		 
		// 1 2 3 4
		
		int tmp = 0;
		if(a.length != k) {
			if(a.length > k) {
				tmp = k;
			} else {
				tmp = k % a.length;
			}
		}
		
		List<Integer> tt = new ArrayList<Integer>();
		
		for(int i=a.length-tmp; i<a.length; i++) {
			tt.add(a[i]);
		}
		for(int i=0; i<a.length-tmp; i++) {
			tt.add(a[i]);
		}
        
        System.out.println("result list : " + tt);
        
        for(int i=0; i<q.length; i++) {
        	result[i] = tt.get(q[i]);
        }
        
        for(int i : result) {
        	System.out.println("result : " + i);
        }
        
	}
	
	
	
}
