package algo_datastructure;

public class Sparse_Arrays {
	
	public static void main(String[] args) {
		String[] str = {"aba", "baba", "aba", "xzxb"};	//�񱳴���ڿ�
		String[] query = {"aba", "xzxb", "ab"};	//���ع��ڿ�
		
		int[] result = new int[query.length];
		int i = 0;
		for(String q : query) {
			int tmp = 0;
			for(String s : str) {
				if(s.equals(q)) {
					tmp++;
				}
			}
			result[i] = tmp;
			i++;
		}
		
		  
		for(int r : result) {
			System.out.print(r + " ");
		}
		
	}
}
