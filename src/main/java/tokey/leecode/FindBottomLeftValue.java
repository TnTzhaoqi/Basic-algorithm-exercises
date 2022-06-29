package tokey.leecode;

import org.junit.Test;
import util.node.ListNode;

import java.util.*;

public class FindBottomLeftValue {

    public int findBottomLeftValue(TreeNode root) {
        TreeNode node = null  ;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while(list.size()!=0){
            node = list.pop();
            if(node.right!=null)
                list.offer(node.right);
            if(node.left!=null)
                list.offer(node.left);

        }
        return node.val;


    }
    public String longestPalindrome(String s) {
        int len = s.length();
        for(int n = len ; n>1;n-- ){
            for(int i = 0 ; (i+n)<=len ; i++){
                String substr = s.substring(i , i+n);
                boolean bool =   isPalindrome( substr);
                if(bool){
                    return substr;
                }
            }
        }
        return null;
    }
    public  boolean isPalindrome(String s){
        boolean bool = true;
        for(int i =0 , n = s.length()-1;(n-i)>1;i++,n--){
            if(s.charAt(i)!=s.charAt(n)){
                bool = false;
                break;
            }
        }
        return bool;
    }
    public String minRemoveToMakeValid(String s) {
        if(s==null||s.length()==0)
            return s;
        Stack<Integer>stack = new Stack<>();
        int len = s.length();
        int [] arr = new int[len];
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < len ; i++){
            char ch  = s.charAt(i);
           if(ch==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    sb.append(ch);
                }
            }else {
               if(ch=='(')
                   stack.push(sb.length());
               sb.append(ch);
           }

        }
        while(!stack.isEmpty()){
            int index = stack.pop();
            sb.deleteCharAt(index);
        }


        return sb.toString();


    }
    class ParanthesesIndex {
        public char parantheses;
        public int index;
        public ParanthesesIndex(char s , int index){
            this.parantheses = s;
            this.index = index;

        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums ,  0 , nums.length);

    }
    public TreeNode sort(int[] nums , int start , int end) {
        if(start==end){
            return new TreeNode(nums[start]);
        }else if(start<end){
            int mid = (start+end )/2;
            TreeNode root = new TreeNode(mid);
            root.left = sort(nums , start , mid-1);
            root.right = sort(nums ,mid+1 , end);
            return root;

        }
        return null;

    }

//    public void reorderList(ListNode head) {
//        if(head==null||head.next==null||head.next.next==null)
//            return  ;
//        Stack<ListNode> stack = new Stack();
//        ListNode node = head.next;
//        while(node!=null){
//            stack.push(node);
//            node = node.next;
//        }
//        int size = stack.size();
//        ListNode lastNode = null;
//       for(int i = 0 ; i < size ; i++){
//           if(i==0)
//               lastNode = stack.pop();
//           else if(i==1)
//               if()
//       }
//
//
//    }
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr!=null){
//            ListNode nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;


        ListNode temp1 = prev;
        ListNode temp2 = curr;
        prev = curr ;
        prev.next = temp1;
        curr = temp2.next;
    }
    return prev;
}


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getChildNodeSum(root , 0 , targetSum);

    }
    public boolean getChildNodeSum(TreeNode node , int sum , int targetSum){
        sum+=node.val;
        if(node.left==null&&node.right==null){

            return sum==targetSum;
        }else if((node.left!=null&&getChildNodeSum(node.left,sum,targetSum))
                &&(node.right!=null&&getChildNodeSum(node.right,sum,targetSum))){
            return true;

        }
        return false;


    }
//    public boolean isPalindrome(String s) {
//        String reverseStr = s.replaceAll("")
//
//    }

    @Test
public void test(){
//        System.out.println(longestPalindrome("aaaaaaaaa"));
//    ListNode node = ListNode.createConsListNode(1,2,3,4,5,6);
//    node.printList();
//    node = reverseList(node);
//    node.printList();

//    TreeNode root = new TreeNode(3);
//    TreeNode left = new TreeNode(9);
//    TreeNode right = new TreeNode(20);
//    TreeNode left1 = new TreeNode(15);
//    TreeNode right2 = new TreeNode(7);
//    root.left = left;
//    root.right = right;
//    right.left = left1;
//    right.right = right2;
//
//    zigzagLevelOrder(root);


}
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
}
