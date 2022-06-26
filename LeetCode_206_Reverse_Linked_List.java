public class LeetCode_206_Reverse_Linked_List {
    /*Given the head of a singly linked list, reverse the list, and return the reversed list.

    Example 1:
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
     */

    //SOLN-->
    /**
     * Definition for singly-linked list.
     * struct ListNode {
     *     int val;
     *     ListNode *next;
     *     ListNode() : val(0), next(nullptr) {}
     *     ListNode(int x) : val(x), next(nullptr) {}
     *     ListNode(int x, ListNode *next) : val(x), next(next) {}
     * };
     */
    class Solution {
        public:
        ListNode* reverseList(ListNode* head) {
            ListNode* next,*prvs=NULL;
            while(head!=NULL){
                next=head->next;
                head->next=prvs;
                prvs=head; //moving the prvs pointer one step ahead
                head=next; //moving the head pointer one step ahead
            }
            head=prvs; //since head will become null so pointing it to last node
            return head;
        }
    };
}
