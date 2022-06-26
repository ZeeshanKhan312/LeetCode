public class LeetCode_876_Middle_of_the_Linked_List {
    /* Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
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
        ListNode* middleNode(ListNode* head) {
            int count=0;
            struct ListNode *ptr=head;
            while(ptr!=NULL){
                count++;
                ptr=ptr->next;
            }
            count=(count)/2;
            ptr=head;
            while(count>0){
                ptr=ptr->next;
                count--;
            }
            head=ptr;
            return head;
        }
    };
}
