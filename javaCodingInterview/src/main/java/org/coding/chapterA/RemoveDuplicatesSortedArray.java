package org.coding.chapterA;


import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {

        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] arg){
        int nums[] = {1,1,2};
        int k=removeDuplicates(nums);
        System.out.println("unique values ::" + k +"\n");
        Arrays.stream(nums,0,k).forEach(num -> System.out.print(num+" "));
    }

}
