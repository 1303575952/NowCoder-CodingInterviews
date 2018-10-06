package first_not_repeat_char;

import java.util.LinkedHashMap;

/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, 
 * ���û���򷵻� -1����Ҫ���ִ�Сд��.
 */
//use linkedhashmap to keep the order
public class Solution {
	public int FirstNotRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int time = map.get(str.charAt(i));
				map.put(str.charAt(i), ++time);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		int pos = -1;
		int i = 0;
		for (; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}
		return pos;
	}
}