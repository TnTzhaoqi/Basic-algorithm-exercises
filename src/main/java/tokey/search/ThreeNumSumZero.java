package tokey.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSumZero {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
//咋回事啊
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        int first = 0;
        int len = nums.length;
        if(nums==null||len<3||nums[first]>0||nums[len-1]<0){
            System.out.println("null num array");
            return list2;
        }
        // if(nums[first]==nums[lem-1]){
        //     list1[]
        // }

        for( ; nums[first]<=0;first++ ){


            if(first>0&&nums[first]==nums[first-1])
                continue;

            for(int second = first+1;second<len-1;second++){
                if(second>first+1&&nums[second]==nums[second+1])
                    continue;
                for(int third = len-1; third>second;third--){
                    if(third<len-1&&nums[third]==nums[third+1])
                        continue;
                    if((nums[first]+nums[second ] + nums[third])<0)
                        break;
                    if((nums[first]+nums[second ] + nums[third])==0){
                        List<Integer> list1 = new ArrayList<Integer>();
                        list1.add(nums[first]);
                        list1.add(nums[second]);
                        list1.add(nums[third]);
                        list2.add(list1);
                    }





                }







            }








        }
        System.out.println(list2);
        System.out.println(list2);
        return list2;







    }

    public static void main(String[] args) {
        int[] arr = {0,0,0};

        threeSum(arr);

    }
}
