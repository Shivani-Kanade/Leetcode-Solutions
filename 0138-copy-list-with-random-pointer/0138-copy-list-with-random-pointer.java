// /*
// // Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }
// */

// /*
// // Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }
// */

// class Solution {
//     public void alternate(Node head1 , Node head2){
//          Node dummy = new Node(-1);
//          Node temp = dummy , temp1 = head1 , temp2=head2;
//          while(temp1!=null && temp2!=null){
//             temp.next = temp1;
//              temp1 = temp1.next;
//              temp = temp.next;
//             temp.next = temp2;
//             temp = temp.next;
//             temp2 = temp2.next;
//          }
//     }

//     public Node copyRandomList(Node head) {
//         if(head==null) return head;
//        Node headn = new Node(head.val);
//        Node temp = head.next;
//        Node temp1 = headn;
//        while(temp!=null){
//         Node newnode = new Node(temp.val);
//         temp1.next= newnode;
//         temp1= temp1.next;
//         temp = temp.next;
//        }
//        alternate(head , headn);
//        temp = head;
//        temp1 = headn;
//        while(temp!=null){
//         temp1 = temp.next;
//        if (temp.random !=null) temp1.random = temp.random.next;
//         temp = temp.next.next; 
//        } 
//       Node t1= head ;
//        Node t2= headn;
//        while(t1!=null){
//         t1.next = t2.next;
//         t1 = t1.next;
//         if(t1==null) break;
//         t2.next = t1.next;
//         t2= t1.next;
//        }
//        return headn;
//     }
// }
class Solution {
    public Node copyRandomList(Node head) { 
        if(head==null) return head;
        HashMap<Node , Node> map = new HashMap<>();
        Node head2 = new Node(head.val);
        Node temp = head.next;
        Node temp2 = head2;
        while(temp!=null){
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = dup;
            temp = temp.next;
        }
        temp = head;
        temp2 = head2;
        while(temp!=null){
           map.put(temp,temp2);
            temp2 = temp2.next;
            temp = temp.next;
        }
        for(Node original : map.keySet()){
            Node dup = map.get(original);
           if(original.random!=null) 
            dup.random = map.get(original.random);
           
        }
        return head2;
        
    }
}