package algo_programmers;

import java.util.Arrays;

public class SkillTest2_5 {

//	� ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.
//	���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] �� ���� �� �ֽ��ϴ�. �� �� ���� ū ���ڴ� 94 �Դϴ�.
	
	public static void main(String[] args) {
		
//		String result = "";
		StringBuffer result = new StringBuffer();
		
		String number = "1852474";
		int k = 4;
		
		int[] numArr = new int[number.length()];
		
		for(int i=0; i<number.length(); i++) {
			numArr[i] = Integer.parseInt(Character.toString(number.charAt(i)));
		}
		
		// number.length - k = 3
		// 0~number.length-3 : 18524   8 8 ���� �� 5�� �ε����� 2
		// 2~number.length-2 : 5247	   7 7 ���� �� 4�� �ε����� 6
		// 6~number.length-1 : 4       4
		
		//i 0 1 2
		//j 3 2 1
		int startIdx = 0;
		for(int i=0; i<numArr.length-k; i++) {
			int biggestNum = 0;
			System.out.println(startIdx +", "+ (numArr.length - (numArr.length-k-i)));
			for(int j=startIdx; j<=k+i; j++) {
				if(numArr[j] > biggestNum) {
					biggestNum = numArr[j];
					startIdx = j+1;
				}
			}
			result.append(biggestNum);
		}
		
		System.out.println(result);
		
	}

}
