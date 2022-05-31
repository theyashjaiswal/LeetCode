/* Problem link - Find Numbers with Even Number of Digits
*/
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(findNumberOfDigits(nums[i]) %2 == 0){
                count++;
            }
        }
        
        return count;
        
        
    }
    public int findNumberOfDigits(int num){
        return (int)Math.log10(num)+1;
    }     
    // public int findNumberOfDigits(int num){
    //     int temp = num;
    //     int count = 0;
    //     while(temp>0){
    //         temp = temp/10;
    //         count++;
    //     }
    //     return count;
    // }
    
    
}