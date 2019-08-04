package no54_char_not_repeat;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Solution {
    private Queue<Character> data = new LinkedList<>();
    private int[] cnt = new int[128];

    //Insert one char from stringstream
    public void insert(char ch) {
        ++cnt[ch - '\0'];
        if (cnt[ch - '\0'] == 1)
            data.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char firstAppearingOnce() {
        while (!data.isEmpty() && cnt[data.peek()] >= 2) data.poll();
        if (data.isEmpty()) return '#';
        return data.peek();
    }
}
