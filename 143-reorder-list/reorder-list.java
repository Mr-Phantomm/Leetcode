/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head.next==null)return;
        ListNode newHead = head;
        ListNode fast = head;
        ListNode prev = head;
        
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=newHead;
            newHead=newHead.next;
        }

        prev.next =null;

        newHead = reverseList(newHead);

        ListNode dummy  = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp1=head;
        ListNode temp2 = newHead;
        while(temp1!=null&&temp2!=null){
            ListNode node1 = temp1;
            temp1=temp1.next;
            node1.next=null;
            temp.next = node1;
            temp=temp.next;

            ListNode node2 = temp2;
            temp2=temp2.next;
            node2.next=null;
            temp.next = node2;
            temp=temp.next;
        }

        if(temp2!=null)temp.next = temp2;

        head = dummy.next;



    }
}