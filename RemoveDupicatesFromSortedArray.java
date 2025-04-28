class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // Initialize the pointer for unique elements
        int i = 0;
        
        // Loop through the array
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;              // Move the pointer
                nums[i] = nums[j]; // Update the value at new position
            }
        }
        
        return i + 1; // Since i is index, length will be i+1
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = obj.removeDuplicates(nums);
        
        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
 
    
