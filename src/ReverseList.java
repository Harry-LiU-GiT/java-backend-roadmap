public class ReverseList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args){
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4);
    ListNode listNode5 = new ListNode(5);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    listNode4.next = listNode5;
    printList(listNode1);
    printList(reverseList(listNode1));
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev, current, next;
        prev = null;
        current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
