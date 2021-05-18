package lv1;
import java.util.ArrayList;
import java.util.List;

public class L42840 {

	public static void main(String[] args) {
		System.out.println(new L42840().solution(new int[] { 1, 3, 2, 4, 2 }));
	}

	public int[] solution(int[] answers) {
		int[] answer2Arr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3Arr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;
        
        int answer;
        int a2, a3;
        for(int i = 0; i < answers.length; i++) {
        	a2 = answer2Arr[i % 8];
        	a3 = answer3Arr[i % 10];
        	
        	answer = answers[i];
        	
        	if(answer == (i % 5) + 1) {
        		correct1 = correct1 + 1;
        	}
        	
        	if(answer == a2) {
        		correct2 = correct2 + 1;
        	}
        	
        	if(answer == a3) {
        		correct3 = correct3 + 1;
        	}
        }
        
        int max = Math.max(correct1, Math.max(correct2, correct3));
        
        List<Integer> list = new ArrayList<>();
        if(max == correct1) list.add(1);
        if(max == correct2) list.add(2);
        if(max == correct3) list.add(3);
        
        int size = list.size();
        int[] output = new int[size];
        for(int i = 0; i < size; i++) {
        	output[i] = list.get(i);
        }
        
        return output;
    }

}
