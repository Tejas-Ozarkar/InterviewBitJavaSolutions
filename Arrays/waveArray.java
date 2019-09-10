/*
    Problem: https://www.interviewbit.com/problems/wave-array
    Author: Tejas Ozarkar
*/

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<A.size();i+=2){
            if(i+1<A.size())
                result.add(A.get(i+1));
            result.add(A.get(i));
        }
        return result;
    }
}
