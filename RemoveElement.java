class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0; // Pointer for placing non-val elements
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i; // The count of elements not equal to val
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        
        int k = obj.removeElement(nums, val);
        
        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
  
    }
}