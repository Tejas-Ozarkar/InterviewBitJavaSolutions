/*
    Problem: https://www.interviewbit.com/problems/min-steps-in-infinite-grid
    Author: Tejas Ozarkar
*/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        for(int i = 0;i<A.size()-1;i++){
            steps += Math.max(Math.abs(A.get(i)-A.get(i+1)), Math.abs(B.get(i)-B.get(i+1)));        
        }
        return steps;
    }
}
