/* Problem link - https://leetcode.com/problems/contains-duplicate/
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();  
        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]);
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}