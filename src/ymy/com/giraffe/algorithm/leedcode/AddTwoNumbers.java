package ymy.com.giraffe.algorithm.leedcode;

/**
 *
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 342+465 = 807
 * Output: 7 -> 0 -> 8
 *
 * Created by yemengying on 15/10/24.
 */
public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1 = new ListNode(1); l1.next = new ListNode(8);
        l2 = new ListNode(0);
        int sum = 0 ;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = newHead;
        while(p1!=null || p2!=null){
            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(sum%10);
            sum /= 10;
            p3 = p3.next;

        }
     return newHead.next;
    }

}
