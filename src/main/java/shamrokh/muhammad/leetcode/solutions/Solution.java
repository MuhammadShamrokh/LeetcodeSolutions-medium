package shamrokh.muhammad.leetcode.solutions;

import shamrokh.muhammad.leetcode.datastructure.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        // 0 or 1 size list
        if(head == null || head.next == null)
            return head;

        ListNode firstPointer = head;
        ListNode secondPointer = head.next;
        ListNode previousPointer = null;
        // setting the new head of the list
        head = head.next;

        while(firstPointer != null && secondPointer != null){
            // swapping pointers
            if(previousPointer != null)
                previousPointer.next = secondPointer;

            ListNode next = secondPointer.next;
            secondPointer.next = firstPointer;
            firstPointer.next = next;

            // moving working pointers forward
            previousPointer = firstPointer;
            firstPointer = next;
            if(next != null)
                secondPointer = next.next;
            else
                secondPointer = null;


        }

        return head;
    }
}


