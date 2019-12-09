package algo;

public class ModifiedCompetitionRanking {
	public static void main(String[] args) {
		
		int[] scores = {80, 90, 90, 100};        
		
		//�����ڰ� �ִٸ� ����+1 �� ��Ű�� ������� ���� �ű�� (ex:1334)
        int[] ranks = new int[scores.length];
        ranks[scores.length - 1] = scores.length;
        for (int i = ranks.length - 2; i >= 0; i--){
            ranks[i] = scores[i] == scores[i + 1] ? ranks[i + 1] : i + 1;
        }   
 
        for(int rank : ranks) {
            System.out.print(rank + " ");
        }        
	}
}
