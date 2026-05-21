public class MergeTwoLists {
    public static void main(String[] args){
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(4);
    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);
    a1.next = a2;
    a2.next = a3;
    b1.next = b2;
    b2.next = b3;
    ListNode head = mergeTwoLists(a1, b1);
    printList(head);
    }
    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current, p1, p2;
        p1 = list1;
        p2 = list2;
        current = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                current.next = p1;
                p1 = p1.next;
                current = current.next;
            }
            else{
                current.next = p2;
                p2 = p2.next;
                current = current.next;
            }
        }
        if(p1 == null){
            current.next = p2;
        }
        else{
            current.next = p1;
        }
        return dummy.next;
    }
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
}
