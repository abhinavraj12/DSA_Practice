class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int left =0;
        int maxCount = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zeroCount++;
            }
            while(zeroCount > k) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left ++;
            }
            maxCount = Math.max(maxCount, right -left +1);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(sol.longestOnes(nums, k)); // Output: 6
    }
}

# 