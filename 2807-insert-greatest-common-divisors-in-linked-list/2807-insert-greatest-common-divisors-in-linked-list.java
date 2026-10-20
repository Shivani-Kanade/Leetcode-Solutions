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
    public int calculate(int a , int b ){
        while(b!= 0){
            int temp = b ;
            b= a%b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       if(head.next==null) return head;
        ListNode temp = head ;
        ListNode temp2 = head.next;
        while(temp2 !=null){
            int gcd = calculate(temp.val , temp2.val);
            ListNode newno = new ListNode(gcd);
           temp.next = newno;
           newno.next = temp2;
           temp = temp2 ; 
           temp2 = temp.next ; 
        }
        return head;
    }
}