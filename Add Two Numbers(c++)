class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode* listNode = new ListNode(0);
        ListNode* currentNode = listNode;

        while (l1 != nullptr || l2 != nullptr) {
            int sum = carry;
            if (l1 != nullptr) {
                sum += l1->val;
                l1 = l1->next;
            }
            if (l2 != nullptr) {
                sum += l2->val;
                l2 = l2->next;
            }
            currentNode->next = new ListNode(sum % 10);
            carry = sum / 10;
            currentNode = currentNode->next;
        }

        if (carry != 0) {
            currentNode->next = new ListNode(carry);
        }

        return listNode->next;
    }
};
