import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] id_pw, String[][] db) {
		Map<String, String> memberTable = new HashMap<>();

		for (int i = 0; i < db.length; i++) {
			memberTable.put(db[i][0], db[i][1]);
		}
		try {
			if (memberTable.get(id_pw[0]).equals(id_pw[1])) {
				return "login";
			} else if (!memberTable.get(id_pw[0]).equals(id_pw[1])) {
				return "wrong pw";
			} else {
				return "fail";
			}
		} catch (Exception e) {
			return "fail";
		}
	}
}