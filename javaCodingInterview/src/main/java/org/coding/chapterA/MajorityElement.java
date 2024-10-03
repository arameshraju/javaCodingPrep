package org.coding.chapterA;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int halfCount=nums.length/2;
        Arrays.sort(nums);
        int n=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(n==nums[i]){
                count++;
            }else{
                count=1;
                n=nums[i];
            }
        }

        return count>=halfCount?n:null;
    }
    public static void main(String[] arg){
        int[] data={3,2,3};
        Arrays.sort(data);

        Arrays.stream(data).forEach(d -> System.out.print(d));
        System.out.println("\n");
        int n=majorityElement(data);
        System.out.println(n);
    }
}
