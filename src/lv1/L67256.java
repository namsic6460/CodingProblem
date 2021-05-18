package lv1;
import java.util.ArrayList;
import java.util.List;

public class L67256 {

	public static void main(String[] args) {
		System.out.println(new L67256().solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));
	}

	public String solution(int[] numbers, String hand) {
        StringBuilder builder = new StringBuilder();
        
        List<int[]> keypad = new ArrayList<>();
        keypad.add(new int[] { 1, 3 });
        keypad.add(new int[] { 0, 0 });
        keypad.add(new int[] { 1, 0 });
        keypad.add(new int[] { 2, 0 });
        keypad.add(new int[] { 0, 1 });
        keypad.add(new int[] { 1, 1 });
        keypad.add(new int[] { 2, 1 });
        keypad.add(new int[] { 0, 2 });
        keypad.add(new int[] { 1, 2 });
        keypad.add(new int[] { 2, 2 });
        
        int[] leftLoc = { 0, 3 };
        int[] rightLoc = { 2, 3 };
        
        int remainder;
        int[] loc;
        boolean isRight = hand.equals("right");
        for(int number : numbers) {
        	if(number == 0) {
        		remainder = 2;
        	} else {
            	remainder = number % 3;
        	}
        	
    		loc = keypad.get(number);
        	
        	if(remainder == 1) {
        		builder.append("L");
        		
        		leftLoc[0] = loc[0];
        		leftLoc[1] = loc[1];
        	} else if(remainder == 0) {
        		builder.append("R");
        		
        		rightLoc[0] = loc[0];
        		rightLoc[1] = loc[1];
        	} else {
        		int leftDis = Math.abs(leftLoc[0] - loc[0]) + Math.abs(leftLoc[1] - loc[1]);
        		int rightDis = Math.abs(rightLoc[0] - loc[0]) + Math.abs(rightLoc[1] - loc[1]);
        		
        		boolean moveRight = isRight;
        		if(leftDis < rightDis) {
        			moveRight = false;
        		} else if(leftDis > rightDis) {
        			moveRight = true;
        		}
        		
        		if(moveRight) {
        			builder.append("R");
            		
            		rightLoc[0] = loc[0];
            		rightLoc[1] = loc[1];
        		} else {
        			builder.append("L");
            		
            		leftLoc[0] = loc[0];
            		leftLoc[1] = loc[1];
        		}
        	}
        }
        
        return builder.toString();
    }

}
