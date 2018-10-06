package all_string_of_char;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 */
public class Solution {
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> re = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return re;
		}
		HashSet<String> set = new HashSet<String>();
		fun(set, str.toCharArray(), 0);
		re.addAll(set);
		Collections.sort(re);
		return re;
	}

	public static void fun(HashSet<String> re, char[] str, int k) {
		if (k == str.length) {
			re.add(new String(str));
			return;
		}
		for (int i = k; i < str.length; i++) {
			swap(str, i, k);
			fun(re, str, k + 1);
			swap(str, i, k);
		}
	}

	public static void swap(char[] str, int i, int j) {
		if (i != j) {
			char t = str[i];
			str[i] = str[j];
			str[j] = t;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = permutation("acc");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}