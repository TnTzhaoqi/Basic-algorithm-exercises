package tokey.leecode;

import org.junit.Test;

import java.util.Arrays;

public class FindMedianSortedArrays {

    @Test
    public void test(){
        int nums1[] = {1,3};
        int nums2[] = {2,4};
        double mid_num = findMedianSortedArrays(nums1,nums2);
        System.out.println(mid_num);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
       double mid_nums  = 0d;
       int start_arr = nums1[0]>=nums2[0]?0:1;
       int num1_index = 0 ;
       int num2_index = 0;
       boolean odd = (len%2==1)?true:false;
       int mid_index=0;
       if(odd)
           mid_index = len/2;
       else
           mid_index= len/2-1;
        for(int i = 0 ; i<len ;i++){
            if(num1_index>=len1)
                num2_index++;
            else if(num2_index>=len2)
                num1_index++;
            else if(start_arr==0){
                num1_index++;
            }else
                num2_index++;
            start_arr=nums1[num1_index]<=nums2[num2_index]?0:1;






        }





       return mid_nums;







    }
}
