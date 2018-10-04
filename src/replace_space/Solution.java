package replace_space;

public class Solution {
	public static String replaceSpace(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "We Are Happy";
		System.out.println(replaceSpace(str));
	}
}
