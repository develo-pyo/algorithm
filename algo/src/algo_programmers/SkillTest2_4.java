package algo_programmers;

public class SkillTest2_4 {
//	���̽�ƽ���� ���ĺ� �̸��� �ϼ��ϼ���. �� ó���� A�θ� �̷���� �ֽ��ϴ�.
	public static void main(String[] args) {
		// A B C D E 
		// F G H I J 
		// K L M 
		//     N O P
		// Q R S T U 
		// V W X Y Z
		
		// J J A A O
		String name = "JAO";
		int result=0;
		int mvmt = name.length()-1;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) != 'A') {
				if(name.charAt(i)<='M') {
					result += name.charAt(i)-'A';
				} else {
					result += 'Z'-name.charAt(i);
				}
			} else {
				int j=1;
				int startIdx = i;
				int aCnt = 1;
				while(i+j < name.length()) {
					if(name.charAt(i+j) == 'A') {
						aCnt++;
					} else {
						break;
					}
					j++;
				}
				int way2 = i-1;
				
				if(mvmt > way2) {
					mvmt=way2;
				}
			}
		}
		
		System.out.println(result);
				
	}

	
}
