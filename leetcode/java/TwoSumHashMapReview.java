import java.util.HashMap;
import java.util.Arrays;

public class TwoSumHashMapReview {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int need = target - num;
            if(map.containsKey(need)){
                return new int[] {map.get(need), i};
            }
            else{
                map.put(num, i);
            }
        }
        return null;
    }
}
