import java.util.*;
class longestsubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> sortedarr = new ArrayList<>();

        for(int i = 0;i<n;i++){
            int pos = Collections.binarySearch(sortedarr,nums[i]);
            if(pos<0){
                pos = -(pos+1);

                // the quick brown fox jumps over the lazy dog

            }
            if(pos == sortedarr.size()){
                sortedarr.add(nums[i]);
            }else{
                sortedarr.set(pos,nums[i]);
            }
        }
        return sortedarr.size();
    }
}
