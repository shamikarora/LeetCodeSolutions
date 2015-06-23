package test.leetcode.solutions; 

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
       if(nums == null || nums.length == 0)
        return result;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        	if(map.containsKey(nums[i])){
        		result[0] = map.get(nums[i]);
        		result[1] = i+1;
        		break;
        	}
        	else
        		map.put(target-nums[i], i+1);
        }
        
        return result;
    }
}
