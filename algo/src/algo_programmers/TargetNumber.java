package algo_programmers;

public class TargetNumber {
	//���α׷��ӽ� > �ڵ��׽�Ʈ���� > ����/�ʺ� �켱����(DFS/BFS) > Ÿ�� �ѹ�
//	n���� ���� �ƴ� ������ �ֽ��ϴ�. �� ���� ������ ���ϰų� ���� Ÿ�� �ѹ��� ������� �մϴ�. 
//	���� ��� [1, 1, 1, 1, 1]�� ���� 3�� ������� ���� �ټ� ����� �� �� �ֽ��ϴ�.
	
//	DFS : Depth-First Search ���� �켱 Ž�� �˰���
//	https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int rs = solution(numbers, target);
		System.out.println("rs:"+rs);
	}

	private static int solution(int[] numbers, int target) {
		int answer = 0;
		
		answer = dfs(numbers, 0, 0, target);
		
		return answer;
	}
	
	private static int dfs(int[] numbers, int node, int sum, int target){
        
//		node 	       1  2  3  4  5
//		sum            1  2  3  4  5  
//		number length  5  
//		target         3
		
		if(node == numbers.length){
            if(sum==target) {
                return 1;
            }
            return 0;
        }
//		System.out.println("> " + (sum+numbers[node])+ "," +(node+1));
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
}
