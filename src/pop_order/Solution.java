package pop_order;

import java.util.Stack;

public class Solution {
	public boolean isPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while (!stack.empty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}
		}
		return stack.empty();
	}
}
