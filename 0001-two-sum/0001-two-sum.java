class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int t = target - nums[i];

            if(map.containsKey(t)) {
                result[0] = map.get(t);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}