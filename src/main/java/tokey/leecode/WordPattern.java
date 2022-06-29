package tokey.leecode;

import org.junit.Test;

/*
给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。

这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。

 

示例1:

输入: pattern = "abba", str = "dog cat cat dog"
输出: true
示例 2:

输入:pattern = "abba", str = "dog cat cat fish"
输出: false
示例 3:

输入: pattern = "aaaa", str = "dog cat cat dog"
输出: false

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/word-pattern
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String [] arr = new String [26];
        String[] sArr = s.split(" ");
        boolean result = true;
        if(sArr.length!=pattern.length()){
            result = false;

        }else{
            for(int i = 0 ; i<sArr.length ;i++){
                String word = sArr[i];
                int index = pattern.charAt(i)-'a';
                if(arr[index]!=null&&!arr[index].equals(word)){
                    result = false;
                    break;
                }
                for(int j = 0 ; j<26;j++){
                    if(j!=index&&word.equals(arr[j])){
                        result = false;
                        return result;
                    }

                }
                arr[index] = word;

            }
        }
        return result;

    }
    @Test
    public void test(){
        String pattern = "abba";
        String s = "dog dog dog dog";
        wordPattern(pattern,s);


    }


}
