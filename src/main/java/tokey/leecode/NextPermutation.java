package tokey.leecode;

import org.junit.Test;

/*
实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。

如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。

必须 原地 修改，只允许使用额外常数空间。
 

示例 1：

输入：nums = [1,2,3]
输出：[1,3,2]
示例 2：

输入：nums = [3,2,1]
输出：[1,2,3]
示例 3：

输入：nums = [1,1,5]
输出：[1,5,1]
示例 4：

输入：nums = [1]
输出：[1]

就是 比123大的下一个数为132

 */
public class NextPermutation {

    @Test
    public void test(){
        int nums[] ={1,2,3};
        nextPermutation(nums);
        for(int num:nums){
            System.out.println(num);
        }




    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len==1)
            return  ;

        for(int i = len-2 ; i>0;i--){

            for(int j = len-1;j>i;j--){
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                    return;
                }



            }



        }


        for(int i = 0,j=len-1;i<j;i++,j--){

            swap(nums,i,j);

        }

    }



    public void swap(int []  nums ,int  m , int  n ){
        int temp =nums[m];
        nums[m] = nums[n];

        nums[n] = temp;


    }
}
