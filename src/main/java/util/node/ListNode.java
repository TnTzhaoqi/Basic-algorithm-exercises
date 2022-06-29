package util.node;

import java.util.List;

public class ListNode {
    public ListNode head;
   public int val;
    public  ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode createConsListNode(int... val){
        ListNode head = new ListNode(0);
        ListNode node = head;
        for(int i : val){
            node.next = new ListNode(i);
            node = node.next;


        }
       return  head.next;
    }
    public void printList(){
        ListNode temp = this ;
        while(temp.next!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println(temp.val);


    }


}
