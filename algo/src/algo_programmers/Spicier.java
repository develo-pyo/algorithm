package algo_programmers;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//programmers, ��, �� �ʰ�
//���� Ǯ�� : priorityqueue �� ���. 
//priorityqueue�� ������ ���� ��(add/offer)���� ���ĵ� ���·� �����Ͱ� �����ǹǷ� �̸� �̿��Ͽ� ���� ��������
public class Spicier {

	public static void main(String[] args) {
		int[] schoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println("result : " + solution(schoville, K));
		
	}

	static int solution(int[] scoville, int K) {
		int rs = 0;
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i:scoville) {
			queue.offer(i);
		}
		
		while(queue.peek() < K) {
			if(queue.size() == 1) {
				return -1;
			}
			int newSco = queue.poll() + queue.poll()*2;
			queue.offer(newSco);
			rs++;
		}
		
		return rs;
    }
}

////���� Ǯ�� : ȿ�������� ����
//public class Spicier {
//
//	public static void main(String[] args) {
//		
//		int[] schoville = {6};
//		int K = 7;
//		
//		System.out.println("result : " + solution(schoville, K));
//		
//	}
//
//	static int solution(int[] scoville, int K) {
//        int answer = 0;
//        
//        List<Integer> list = new ArrayList<>();
//        for(int i : scoville) {
//        	list.add(i);
//        }
//        order(list);
//        
//        while(list.size() > 0) {
//        	if(check(list, K)) {
//        		return answer;
//        	}
//        	if(list.size() == 1) {
//        		return -1;
//        	}
//        	int newSco = list.get(0) + (list.get(1)*2);
//        	list.remove(0);
//        	list.remove(0);
//        	list.add(newSco);
//        	order(list);
////        	print(list);
//        	answer ++;
//        }
//        return -1;
//    }
//	
//	static void print(List<Integer> list) {
//		for(int i:list) {
//			System.out.print(i+" ");
//		}
//	}
//	
//	static List<Integer> order(List<Integer> input){
//		Collections.sort(input);
//		return input;
//	}
//	
//	static boolean check(List<Integer> list, int K) {
//		boolean rs = true;
//
//		for(int i : list) {
//			if(i < K) {
//				return false;
//			}
//		}
//		
//		return rs;
//	}
//}

