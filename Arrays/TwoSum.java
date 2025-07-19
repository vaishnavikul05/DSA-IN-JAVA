import java.util.HashMap;
import java.util.Map;

public class TwoSum {
     public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0]; 
    }




    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(twoSum(nums, target));
    }
}
