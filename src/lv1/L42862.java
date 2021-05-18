package lv1;
import java.util.Map;
import java.util.TreeMap;

public class L42862 {

	public static void main(String[] args) {
		System.out.println(new L42862().solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		Map<Integer, Integer> newLost = new TreeMap<>();
		Map<Integer, Integer> newReserve = new TreeMap<>();
		
		for(int l : lost) {
			newLost.put(l, 1);
		}
		
		for(int r : reserve) {
			if(newLost.remove(r) == null) {
				newReserve.put(r, 1);
			}
		}

		n -= newLost.size();
		
		for(int l : newLost.keySet()) {
			if(newReserve.containsKey(l - 1)) {
				n++;
				newReserve.remove(l - 1);
			} else if(newReserve.containsKey(l + 1)) {
				n++;
				newReserve.remove(l + 1);
			}
		}

		return n;
	}
	
}
