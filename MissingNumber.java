/* Problem link - https://leetcode.com/problems/missing-number/
*/
class Solution {
    public int missingNumber(int[] nums) {
        int arraySize = nums.length;
        int sum=0;
        int intendedSum=0;
        System.out.println(arraySize);
        int i=0;
        for(i=0;i<arraySize;i++){
            sum+=nums[i];
            intendedSum+=i;
        }
        intendedSum+=i;
        System.out.println(sum);
        System.out.println(intendedSum);
        return (intendedSum-sum) ;
    }
}