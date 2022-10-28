package twosum;

import java.util.HashMap;
import java.util.Map;

public class FifthSolution {
	public int[] twoSumssss(int[] nums, int target) {
		
		Map<Integer, Integer> complements = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			if (complementIndex != null) {
				return new int[] {i, complementIndex};
			}
			complements.put(target - nums[i], i);	
		}
		
		return nums;
		
		
	}
	

}