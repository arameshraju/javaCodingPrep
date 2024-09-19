package org.coding.chapterA;


import java.util.Arrays;

public class RemoveDuplicatesSortedArray2 {
    public static int removeDuplicates(int[] nums) {

        int k=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            cnt= (nums[i]==nums[i-1])?++cnt:1;

            if(  cnt<3){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;

    }
    public static void main(String[] arg){
        int nums[] = {1,1,1,2,2,3,3,3};
        int k=removeDuplicates(nums);
        System.out.println("\n  not more the twice  values ::" + k +"\n");
        Arrays.stream(nums,0,k).forEach(num -> System.out.print(num+" "));

    }

}
