package shamrokh.muhammad.leetcode.solutions;

import shamrokh.muhammad.leetcode.datastructure.ListNode;

import java.util.*;


public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode scanner = head;
        int counter = 1;
        int listLength = countListLength(head);

        // edge case, list has 1 node and we have to remove it
        if(listLength == 1)
            return null;

        //edge case, we have to delete the head of the node
        if(listLength == n){
            return head.next;
        }

        // scanning the list till we reach the nth previous node
        while(counter <  listLength - n){
            scanner = scanner.next;
            counter++;
        }

        //removing the nth node
        scanner.next = scanner.next.next;

        return head;
    }

    private int countListLength(ListNode head) {
        int counter = 0;

        while(head != null){
            counter++;
            head = head.next;
        }

        return counter;
    }
}


