 package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
      public int[] twoSum(int[] nums, int target) {
        
      Map<Integer, Integer> map = new HashMap<>();
          int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int twosum  = target - nums[i];

            if (map.containsKey(twosum)) {
                return new int[] { map.get(twosum), i };
        
            }
            map.put(nums[i], i);
        }

        return result; // no solution found
    }
    public static void main(String[] args) {
          TwoSum obj = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
        
    }
   

 
 
    
 