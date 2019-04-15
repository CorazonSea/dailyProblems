class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          
        ListNode q = new ListNode(0);
        ListNode node = q;
        
        int val = 0;
        int num = 0;
        while(l1 != null && l2 != null){        	
            val = (l1.val + l2.val + num) % 10;
            ListNode p = new ListNode(val);
            num = (l1.val + l2.val + num) / 10;
            l1 = l1.next;
            l2 = l2.next;
            q.next = p;
            q = q.next;
        }
        while(l1 != null){
            val = (l1.val + num) % 10;
            ListNode p = new ListNode(val);
            num = (l1.val + num) / 10;
            l1 = l1.next;
            q.next = p;
            q = q.next;
        }
        while(l2 != null){
            val = (l2.val + num) % 10 ;
            ListNode p = new ListNode(val);
            num = (l2.val + num) / 10;
            l2 = l2.next;
            q.next = p;
            q = q.next;
        }
        if (num > 0){
            ListNode p = new ListNode(num);
            q.next = p;
            q = q.next;
        }
        
        return node.next;
        
        
    }
}
