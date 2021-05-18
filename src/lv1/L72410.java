package lv1;

public class L72410 {

	public static void main(String[] args) {
		System.out.println(new L72410().solution("...!@BaT#*..y.abcdefghijklm"));
	}

	public String solution(String new_id) {
		String id = new_id.toLowerCase()
				.replaceAll("[^a-z0-9-_\\.]", "")
				.replaceAll("[\\.]{2,}", "\\.");
		
		if(id.startsWith(".")) {
			id = id.substring(1);
		}
		
		if(id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}
		
		if(id.equals("")) {
			return "aaa";
		}
		
		if(id.length() >= 16) {
			id = id.substring(0, 15);
			
			if(id.endsWith(".")) {
				id = id.substring(0, 14);
			}
		}
		
		int length = id.length();
		if(length < 3) {
			char lastChar = id.charAt(id.length() - 1);
			
			for(int i = 0; i < 3 - length; i++) {
				id += lastChar;
			}
		}
		
		return id;
	}

}
