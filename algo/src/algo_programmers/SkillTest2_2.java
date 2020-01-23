package algo_programmers;

import java.util.Arrays;

public class SkillTest2_2 {
//	�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
	public static void main(String[] args) {
		int result = 0;
		long[] arr = {1,2,3,4};
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					long num = arr[i] + arr[j] + arr[k];
					if(check(num)) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	static boolean check(long input) {
		boolean rs = true;
		long length = input;
		for(long i=2; i<length; i++) {
			if(input%i==0) {
				return false;
			}
		}
		return rs;
	}
}
