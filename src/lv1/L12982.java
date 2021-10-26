package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L12982 {

	public static void main(String[] args) {
		new L12982().solution(new int[] { 1, 3, 4, 2, 5 }, 9);
	}

	public int solution(int[] d, int budget) {
		List<Integer> list = new ArrayList<>();

		for (int i : d) {
			list.add(i);
		}

		Collections.sort(list);

		int count = 0;
		for (int i : list) {
			budget -= i;

			if (budget >= 0) {
				count++;
			} else {
				break;
			}
		}
		
		return count;
	}

}
