/*
    Problem: https://www.interviewbit.com/problems/hotel-bookings-possible
    Author: Tejas Ozarkar
*/

public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int count = 1, i=1 , j=0;
        int n = arrive.size();
        Collections.sort(arrive);
        Collections.sort(depart);
        while(i<n&&j<n){
            if(arrive.get(i)<depart.get(j)){
                count++;
                i++;
                if(count>K)
                    return false;
            }else{
                count--;
                j++;
            }
        }
        return (count<=K);
    }
}