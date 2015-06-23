package test.leetcode.solutions;

public class SolutionsTest {

	public static void main(String[] args){
		TwoSum twoSum = new TwoSum();
		int[] input = {12,7,11,15};
		int target = 13;
		int[] result = twoSum.twoSum(input, target);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}
