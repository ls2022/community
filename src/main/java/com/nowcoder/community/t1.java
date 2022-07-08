package com.nowcoder.community;

import java.util.*;

public class t1 {
    public static void main(String[] args) {
        int[] nums={1,-1,-1,0};
        t1 t=new t1();
        List<List<Integer>> result= t.threeSum(nums);
        System.out.println(result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums[0]);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Deque<Character> deque=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return res;
            }
            if(i>0 && nums[i]==nums[i-1]){//注意这段代码！！！
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0)right--;
                else if(sum<0)left++;
                else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(right>left && nums[right]==nums[right-1])right--;
                    while(right>left && nums[left]==nums[left+1])left++;
                    right--;
                    left++;
                }

            }
        }
        return res;
    }
}
