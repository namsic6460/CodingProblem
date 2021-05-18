package lv1;
import java.util.HashSet;
import java.util.Set;

public class L1845 {

	public static void main(String[] args) {
		System.out.println(new L1845().solution(new int[] { 3, 3, 3, 2, 2, 4 }));
	}

	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			set.add(num);
		}
		
		return Math.min(nums.length / 2, set.size());
    }

}
