public class Solution {
    
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int i = A.size()-1;
        if(A.get(i)<9){
            A.set(i, A.get(i)+1);
        }else{
            A.set(i, 0);
            if(i==0){
                A.add(0,1);
            }else{
                i--;
                boolean addToLast = true;
                while(A.get(i)==9){
                    A.set(i,0);
                    if(i==0){
                        A.add(0,1);
                        addToLast = false;
                        break;
                    }   
                    i--;
                      
                }
                if(addToLast)
                    A.set(i, A.get(i)+1);
            }
        }
        while(A.get(0)==0){
            A.remove(0);
        }
        return A;
    }
}
