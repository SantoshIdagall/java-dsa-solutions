package arrays;

public class MaxSubArray {
    public static int maxSubArray(int [] nums){
        int maxsum = nums[0];
        int csum = 0;

        for(int i = 1 ; i< nums.length; i++){
            csum +=nums[i];
            maxsum = Math.max(maxsum,csum);

             if (csum < 0) {
                csum = 0;
            
             }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    
}
