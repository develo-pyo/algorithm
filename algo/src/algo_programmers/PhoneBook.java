package algo_programmers;

import java.util.Arrays;

public class PhoneBook {
	
	//���α׷��ӽ�, �ؽ�, ��ȭ��ȣ ���
	public static void main(String[] args) {
		boolean answer = true;
        String[] phone_book = {"119", "97674223", "1195524421"}; 
		
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=i+1; j<phone_book.length; j++) {
        		if(phone_book[j].startsWith(phone_book[i])){
        			answer = false;
        			break;
        		}
        	}
        }
        for(String s : phone_book) {
        	System.out.print(s + " ");
        }
        
        System.out.println(answer);
//		return answer;
	}

}
