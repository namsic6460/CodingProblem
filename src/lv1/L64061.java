package lv1;
import java.util.ArrayList;
import java.util.List;

public class L64061 {

	public static void main(String[] args) {
		System.out.println(new L64061().solution(
			new int[][] {
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 3 },
				{ 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 }
			}, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }
		));
	}

	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		int size = board.length;
		List<Integer> box = new ArrayList<>();

		for (int move : moves) {
			int newMove = move - 1;
			int number = 0;

			for (int i = 0; i < size; i++) {
				number = board[i][newMove];

				if (number != 0) {
					board[i][newMove] = 0;
					break;
				}
			}

			if (number != 0) {
				if (!box.isEmpty()) {
					int lastIdx = box.size() - 1;
					int lastNumber = box.get(lastIdx);
					
					if(lastNumber == number) {
						answer++;
						box.remove(lastIdx);
						continue;
					}
				}

				box.add(number);
			}
		}

		return answer * 2;
	}

}
