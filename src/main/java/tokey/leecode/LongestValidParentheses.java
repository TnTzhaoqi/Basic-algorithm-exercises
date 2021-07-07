package tokey.leecode;

import java.util.Stack;

/*
给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        Stack<Character> stack = new Stack<Character>();
        int len = s. length();
        boolean flag = false;
        int max = 0 ;
        int count = 0;
        for(int i = 0 ; i<len;i++){

            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else{
                char  stack_ch = stack.peek();
                if(stack_ch=='('){
                    if(flag)
                        count++;
                }


            }









        }









    }

}
