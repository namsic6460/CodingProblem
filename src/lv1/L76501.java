package lv1;

public class L76501 {

	public static void main(String[] args) {
		new L76501().solution(new int[] {4, 7, 12}, new boolean[] {true, false, true});
	}

	public int solution(int[] absolutes, boolean[] signs) {
		int sum = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				sum += absolutes[i];
			} else {
				sum -= absolutes[i];
			}
		}
		
		System.out.println(sum);
		return sum;
	}

}
