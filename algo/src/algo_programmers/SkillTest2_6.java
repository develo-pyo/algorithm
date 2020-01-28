package algo_programmers;

public class SkillTest2_6 {
//	�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� �� �Դϴ�.
//
//	�������
//
//	F(2) = F(0) + F(1) = 0 + 1 = 1
//	F(3) = F(1) + F(2) = 1 + 1 = 2
//	F(4) = F(2) + F(3) = 1 + 2 = 3
//	F(5) = F(3) + F(4) = 2 + 3 = 5
//	�� ���� �̾����ϴ�.
//
//	2 �̻��� n�� �ԷµǾ��� ��, n��° �Ǻ���ġ ���� 1234567���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��� �ּ���.
	public static void main(String[] args) {
		
		int rs = solution(100000);
		System.out.println(rs);
		
	}

	
	private static int solution(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i=0; i<n; i++) {
//			System.out.println(a+","+b+","+c);
			a = b%1234567;
			b = c%1234567;
			c = (a+b)%1234567;
		}
		
		return c;
    }
}
