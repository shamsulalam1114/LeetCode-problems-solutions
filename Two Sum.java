

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (numberMap.containsKey(difference)) {
                return new int[]{i, numberMap.get(difference)};
            }
            numberMap.put(nums[i], i);
        }
        return new int[2]; // This will return an array with default values [0, 0] if no solution is found
    }
}
