class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // i points to the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // move i to next position
                nums[i] = nums[j]; // update value at i
            }
        }

        return i + 1; // i is index, so count = i+1
    }
}
