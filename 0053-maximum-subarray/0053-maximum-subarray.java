class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
		int n = 0;
		
		for(int num : nums) {
			n = Math.max(n + num, num);
			max = Math.max(n, max);
		}
        return max;
    }
}