//Given a linked list, swap every two adjacent nodes and return its head. 
//
// You may not modify the values in the list's nodes, only nodes itself may be c
//hanged. 
//
// 
//
// Example: 
//
// 
//Given 1->2->3->4, you should return the list as 2->1->4->3.
// 
// Related Topics Linked List

  
package com.shuzijun.leetcode.editor.en;
  
public class SwapNodesInPairs{
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
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
    /**
     * interactive solution
     */
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1);
        ListNode newHead = pre;
        ListNode curr = head;
        while (null != curr) {
            if (null == curr.next) {
                pre.next = curr;
                break;
            }
            ListNode temp = curr.next.next;
            pre.next = curr.next;
            pre = curr;
            curr.next.next = curr;
            curr.next = null;
            curr = temp;
        }
        return newHead.next;
    }

    /**
     * recursive solution
     */
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next)  return head;
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}