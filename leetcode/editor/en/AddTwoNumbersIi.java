//You are given two non-empty linked lists representing two non-negative integer
//s. The most significant digit comes first and each of their nodes contain a sing
//le digit. Add the two numbers and return it as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself. 
//
// Follow up: 
//What if you cannot modify the input lists? In other words, reversing the lists
// is not allowed.
// 
//
// 
//Example:
// 
//Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 8 -> 0 -> 7
// 
// Related Topics Linked List

  
package com.shuzijun.leetcode.editor.en;
  
public class AddTwoNumbersIi{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbersIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = buildStack(l1);
        Stack<Integer> s2 = buildStack(l2);
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            sum += s1.isEmpty() ? 0 : s1.pop();
            sum += s2.isEmpty() ? 0 : s2.pop();
            list.val = sum % 10;
            ListNode currHead = new ListNode(sum / 10);
            currHead.next = list;
            list = currHead;
            sum /= 10;
        }
        return 0 == list.val ? list.next : list;
    }

    private Stack<Integer> buildStack(ListNode list) {
        Stack<Integer> stack = new Stack<>();
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
        return stack;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}