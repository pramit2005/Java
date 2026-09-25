//This is the brute-force approch
/*class Solution {
    long sum_of_elements(List<Integer> arr){
        long even=0,odd=0;
        for(int i=0;i<arr.size();i++){
            if(i%2==0){
                even+=arr.get(i);
            }
            else{
                odd+=arr.get(i);
            }
        }
        return even-odd;
    }
    public long maxAlternatingSum(int[] nums) {
            List<List<Integer>> subsequences= new ArrayList<>();
            subsequences.add(new ArrayList<>());
            for(int num:nums){
                int size=subsequences.size();
                for(int i=0;i<size;i++){
                    List<Integer> temp=new ArrayList<>(subsequences.get(i));
                    temp.add(num);
                    subsequences.add(temp);
                }
            }
        long max=Integer.MIN_VALUE;
        for(List<Integer> num:subsequences){
            long x=sum_of_elements(num);
            if(x>max)
                max=x;
        }
        return max;
    }
}
*/
//This is the dynamic programming approch, where Add means the state where the last element was added 
//Subtract means the state where the last element was subtracted
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long add = 0;
        long subtract = 0;

        for (int num : nums) {
            long newAdd = Math.max(add, subtract + num);
            long newSubtract = Math.max(subtract, add - num);

            add = newAdd;
            subtract = newSubtract;
        }

        return add;
    }
}