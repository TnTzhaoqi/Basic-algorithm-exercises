package tokey.leecode;

import org.junit.Test;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class FindTreeNode {
/*
给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。

 

示例 1：


输入：n = 3
输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
示例 2：

输入：n = 1
输出：[[1]]
 

提示：

1 <= n <= 8

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/unique-binary-search-trees-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


    @Test
    public  void test(){

        generateTrees(3);





    }











    public List<TreeNode> generateTrees(int n ){
        List<TreeNode> list = new ArrayList<>();
        if(n<1)
            return list;
        list = generateTrees(1,n);
        return list;






    }

    public List<TreeNode> generateTrees(int start , int end  ) {
        List<TreeNode> list = new ArrayList<>();

        if (start > end) {
            return list;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left_list = generateTrees(start, i-1);
            List<TreeNode> right_list = generateTrees(i + 1, end);

            for (TreeNode left : left_list) {
                for (TreeNode right : right_list) {
                    TreeNode current_node = new TreeNode(i);
                    current_node.left = left;
                    current_node.right = right;
                    list.add(current_node);
                }
            }


        }
        return list;
    }


        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    }
