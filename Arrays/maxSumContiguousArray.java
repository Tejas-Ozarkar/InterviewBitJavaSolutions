/*
    Problem: https://www.interviewbit.com/problems/max-sum-contiguous-subarray
    Author: Tejas Ozarkar
*/

public class Solution {

    public int maxSubArray(final List<Integer> A) {
        int sum = 0, max=0, maxItem=-1001;
        for(int i = 0;i<A.size();i++){
            int currentValue = A.get(i);
            if(currentValue>maxItem)
                maxItem = currentValue;
            sum+=currentValue;
            if(sum<0)
                sum = 0;
            if(sum>max)
                max = sum;
        }
        return max==0?maxItem:max;
    }
}
