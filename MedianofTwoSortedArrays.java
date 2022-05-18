/* Problem link - https://leetcode.com/problems/median-of-two-sorted-arrays/  */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArray[] = new int[nums1.length+nums2.length];
        int pos = 0;  
        for (int element : nums1) //copying elements of secondArray using for-each loop  
        {  
            mergedArray[pos] = element;  
            pos++;              //increases position by 1  
        }  
        for (int element : nums2) //copying elements of firstArray using for-each loop  
        {  
            mergedArray[pos] = element;  
            pos++;  
        }  
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));  
        int n = mergedArray.length;
        if(n%2==0){
            //even
            return ((double)mergedArray[(n/2)-1]+(double)mergedArray[(n/2)])/(double)2;
        }
        else{
            //odd
            return Math.floor(mergedArray[(n)/2]);
            
        }
    }
}