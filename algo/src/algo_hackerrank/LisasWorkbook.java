package algo_hackerrank;

public class LisasWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 6, 1, 10};
		System.out.println(workbook(5, 3, arr));
	}
	
	static int workbook(int n, int k, int[] arr) {
		int result = 0;
		
		int page = 1;
		
		for(int i=0; i<arr.length; i++) {
			int problems = arr[i];
			
			for(int problem=1; problem <=problems; problem++) {
				if(problem == page) {
					//�������� ���׹�ȣ�� ��ġ�ϸ� ���++
					result++;
				}
				if(problem % k == 0 || problem==problems) {
					//���׹�ȣ�� �ִ� ������ �����ϸ� ������++
					//���׹�ȣ�� ������ ���׹�ȣ�� ��� ������++
					page++;
				}
			}
		}
		
		return result;
    }

}
