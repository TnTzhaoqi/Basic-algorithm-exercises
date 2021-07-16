package tokey.leecode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class VerifySearchTree {



    public boolean isValidBST(TreeNode root) {

        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root) ;
        TreeNode node;
        while ((node=queue.poll())!=null){
            if(node.left!=null){
                if(node.val<=node.left.val)
                    return false;
                queue.offer(node.left);


            }
            if(node.right!=null){
                if(node.val>=node.right.val)
                    return false;
                queue.offer(node.right);

            }



        }


        return true;
    }

      public class TreeNode {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> q1  = new LinkedList();

        Queue<TreeNode> q2  = new LinkedList();
        List<List<Integer>> list  = new LinkedList();

        q1.add(root);
        while(!q1.isEmpty()||!q2.isEmpty()){
            List<Integer> clist = new LinkedList();
            Queue<TreeNode> current_q =q1.isEmpty()?q2:q1;
            Queue<TreeNode> next_q = q1.isEmpty()?q1:q2;
            while(!current_q.isEmpty()){
                TreeNode node = current_q.poll();
                clist.add(node.val);
                if(node.left!=null)
                    next_q.add(node.left);
                if(node.right!=null)
                    next_q.add(node.right);

            }
            list.add(0,clist);





        }

        return list;



















    }

    public boolean isBalanced(TreeNode root) {

        if(root==null)
            return true;

        if(root.left==null&&root.right==null)
            return true;
        if(root.left!=null&&root.right!=null)
            return isBalanced(root.left)&&isBalanced(root.right);
        if(root.left==null&&(root.right.left!=null||root.right.right!=null))
            return false;
        if(root.right==null&&(root.left.left!=null||root.left.right!=null))
            return false;
        return true;







    }


}
