/* Problem link - https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int finalLength=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[finalLength]!=nums[i]){
                nums[finalLength+1]=nums[i];
                finalLength++;
            }
        }
        return finalLength+1;
        
    }
}