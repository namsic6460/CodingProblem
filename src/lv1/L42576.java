package lv1;
import java.util.HashMap;
import java.util.Map;

public class L42576 {

	public static void main(String[] args) {
		System.out.println(new L42576().solution(
				new String[] { "leo", "kiki", "eden" },
				new String[] { "eden", "kiki" }
		));
	}

	public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String string : participant) {
        	map.put(string, map.getOrDefault(string, 0) + 1);
        }
        
        int count;
        for(String string : completion) {
        	count = map.get(string);
        	
        	if(count == 1) {
        		map.remove(string);
        	} else {
        		map.put(string, count - 1);
        	}
        }
        
        return (String) map.keySet().toArray()[0];
    }

}
