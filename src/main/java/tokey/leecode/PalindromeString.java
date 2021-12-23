package tokey.leecode;

import org.junit.Test;

public class PalindromeString {
/*
给你一个字符串数组 words ，找出并返回数组中的 第一个回文字符串 。如果不存在满足要求的字符串，返回一个 空字符串 "" 。

回文字符串 的定义为：如果一个字符串正着读和反着读一样，那么该字符串就是一个 回文字符串 。
示例 1
输入：words = ["abc","car","ada","racecar","cool"]
输出："ada"
解释：第一个回文字符串是 "ada" 。
注意，"racecar" 也是回文字符串，但它不是第一个。
示例 2：

输入：words = ["notapalindrome","racecar"]
输出："racecar"
解释：第一个也是唯一一个回文字符串是 "racecar" 。
示例 3：

输入：words = ["def","ghi"]
输出：""
解释：不存在回文字符串，所以返回一个空字符串。


提示：

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] 仅由小写英文字母组成
 */
public long getDescentPeriods(int[] prices) {
    int len = prices.length;
    int result = len ;
    if(len==1)
        return result;
    int dec = 1;
    for(int i = 0; i<len-2;i++ ){
        if((prices[i]-prices[i+1])==1){
            dec++;
        }else{
            result+=sum(dec);
            dec=1;
        }

    }
    result+=sum(dec);
    return result;


}


    private int sum( int num){
        int result = num==1?0:num==2?1:num*(num-1)/2;

        return result;





    }
    @Test
   public  void test(){
        int [] arr = new int[100000];
        for(int i = 0 ; i < 100000;i++){
            arr[i] = 100000-i;
        }
        getDescentPeriods(arr);


    }



}




