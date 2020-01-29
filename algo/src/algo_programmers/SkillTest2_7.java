package algo_programmers;

import java.util.ArrayList;
import java.util.List;

public class SkillTest2_7 {
	
	//���α׷��ӽ� ��ų�׽�Ʈ lv 2
	
//	���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. 
//	�� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
//	��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, 
//	�̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
//	���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� 
//	�� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
	
	public static void main(String[] args) {
		int[] prog = {93,30,55};
		int[] speeds = {1, 30, 5};
		
		int[] rs = solution(prog, speeds);
		for(int i : rs) {
			System.out.print(i + " ");
		}
	}
	
	private static int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	int tmp = progresses[i];
        	int cnt = 0;
        	while(tmp < 100) {
        		tmp += speeds[i];
        		cnt++;
        	}
        	list.add(cnt);
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        int tmp = 0;
        for(int i=0; i<list.size(); i++) {
        	tmp = list.get(i);
        	int cnt = 0;
        	for(int j=i; j<list.size() && list.get(j) <= tmp; j++) {
        		cnt++;
        		i=j;
        	}
        	resultList.add(cnt);
        }
        
//        for(int i:resultList) {
//        	System.out.print(i + " ");
//        }
        
        int[] answer = new int[resultList.size()];
        
        int idx=0;
        for(int i:resultList) {
        	answer[idx] = i;
        	idx++;
        }
        
        return answer;
    }
}
