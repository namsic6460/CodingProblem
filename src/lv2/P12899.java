package lv2;

public class P12899 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(new P12899().solution(i));
		}
	}
	
	public String solution(int n) {
		String answer = "";
		String[] values = {"4", "1", "2"};

		while(n > 0) {
			answer = values[n % 3] + answer;
			n = (n - 1) / 3;
		}
		
		return answer;
	}
	
}
