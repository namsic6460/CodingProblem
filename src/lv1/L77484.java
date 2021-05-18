package lv1;
import java.util.HashSet;
import java.util.Set;

public class L77484 {

	public static void main(String[] args) {
		new L77484().solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19});
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		Set<Integer> winSet = new HashSet<>();
		for(int winNum : win_nums) {
			winSet.add(winNum);
		}
		
		int correct = 0;
		int erased = 0;
		for(int lotto : lottos) {
			if(lotto == 0) {
				erased++;
			} else if(winSet.contains(lotto)) {
				correct++;
			}
		}
		
		System.out.println(correct);
		System.out.println(erased);
		
		int[] answer = new int[2];
		answer[0] = 7 - correct - erased;
		answer[1] = Math.min(7 - correct, 6);
		return answer;
	}

}
