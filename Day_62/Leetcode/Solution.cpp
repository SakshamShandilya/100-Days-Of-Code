class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int K=lists.size();
        ListNode *head=new ListNode(-1), *temp=head;
        priority_queue<int,vector<int>,greater<int>> pq;
        for(int i=0;i<K;i++){
            ListNode *temp1=lists[i];
            while(temp1!=NULL){
                pq.push(temp1->val);
                temp1=temp1->next;
            }
        }
        while(!pq.empty()){
            ListNode *newNode=new ListNode(pq.top());
            pq.pop();
            head->next=newNode;
            head=head->next;
        }
    return temp->next;      
    }
};
