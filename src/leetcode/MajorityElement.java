package leetcode;

import org.junit.Test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    @Test
    public void test1(){

        int nums[] ={2,1,1,1,2,2,2};

        int mj = majorityElement(nums);
        int mj1=  majorityElement1(nums);
        int mj2 = majorityElement2(nums);
        System.out.println(mj);
        System.out.println(mj1);
        System.out.println(mj2);


    }
    /**
     * 算法基础：摩尔投票法
     * @param nums nums
     * @return int
     */
    public int majorityElement(int nums[]){

        int mj =0;      //当前判断的元素
        int count =0;    //计算当前数字出现的次数
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                mj = nums[i];
                count=1;
            }else if(nums[i] == mj){
                count++;
            }else {
                count--;
            }
        }
        int counter = 0;
        if(count<=0){
            return -1;

        }else {
            for(int num:nums){
                if(num == mj){
                    counter++;
                }
            }
        }
        if(counter>nums.length/2){
            return mj;
        }

        return -1;
    }


    //利用map实现
    public int majorityElement1(int nums[]){

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
            if(map.get(num)>nums.length/2){
                return num;
            }

        }
        return -1;
    }
    //先排序，众数一定会出现在数组的中间位置。
    public int majorityElement2(int nums[]){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
