class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int c=0;
       int multi=1;
       int srt=0;
       for(int i=0;i<nums.length;i++){
        multi*=nums[i];
        while(multi>=k&&srt<=i){
            multi/=nums[srt++];
        }
        c+=i-srt+1;
       }
       return c;
    }
}