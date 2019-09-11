/*
    Problem: https://www.interviewbit.com/problems/prime-sum
    Author: Tejas Ozarkar
*/

public class Solution {
    
    public boolean findPrime(int n){
        for(int i = 2; i<= n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i< A;i++){
            if(findPrime(i)&&findPrime(A-i)){
                result.add(i);
                result.add(A-i);
                break;
            }
        }
        return result;
        
    }
}
