package tokey.leecode;

import org.junit.Test;

import java.util.Random;

public class NodePartition {

    @Test
    public  void test(){
        ListNode head = new ListNode(-1);
        ListNode node = head;
        Random random  = new Random();
        for(int i = 0 ; i < 2 ;i++){
           ListNode newnode = new ListNode(random.nextInt(1));
            node.next = newnode;
            node = newnode;
        }
        printlist(head.next);
        ListNode node2 = partition(head.next,5);
//        while(node2!=null){
//             System.out.println(node2.val);
//             node2 = node2.next;
//
//        }

    }
    public void printlist(ListNode node){
        System.out.println("start print list");
        while(node!=null){
            System.out.println(node.val);
            node = node.next;

        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode lhead = new ListNode(-1);
        ListNode rhead = new ListNode(-1);
        ListNode lnode   = lhead;
        ListNode rnode = rhead ;
        ListNode next = head;
        while(next!=null){
            int val = next.val;
            if(next.val<x){

//                    ListNode newnode  = new ListNode(val);
                    lnode.next = new ListNode(val);
                    lnode = lnode.next;

            }else{
                rnode.next = new ListNode(val);
                rnode = rnode.next;
            }
            rnode.next=null;
            next = next.next;

        }
        System.out.println("wiwiwiwiwiwiiw");
        printlist(lhead.next);
        printlist(rhead.next);
        lnode.next = rhead.next;
        return lhead.next;




    }





    class ListNode {

        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

