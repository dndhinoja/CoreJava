package com.dn.corejava;

public class LeetCodeTwoSum {
    private int[] indexOfNumber(int[] nums,int target) {
        int[] indexes = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4};
        int target =  7;

        LeetCodeTwoSum leetCodeTwoSum = new LeetCodeTwoSum();
        int[] indexes = leetCodeTwoSum.indexOfNumber(numbers,target);

    }


}
