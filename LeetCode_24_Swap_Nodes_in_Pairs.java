public class LeetCode_24_Swap_Nodes_in_Pairs {
    /* Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the
        list's nodes (i.e., only nodes themselves may be changed.)
        Example 1.
        Input: head = [1,2,3,4]
        Output: [2,1,4,3]
    */

    //SOLUTION->
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode temp=new ListNode();
            temp.next=head;
            ListNode node=temp;
            while(node.next!=null){
                ListNode first=node.next;
                ListNode second=first.next;
                if(second!=null){
                    ListNode secondNext= second.next;
                    second.next=first;
                    node.next=second;
                    first.next=secondNext;
                    node=first;
                }
                else
                    break;
            }
            return temp.next;
        }
    }
}
