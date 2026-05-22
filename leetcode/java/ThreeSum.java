import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        threeSum(nums);
    }

    public static void threeSum(int[] nums) {
        int left, right;
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            int sum = nums[i] + nums[left] + nums[right];
            while(left < right){
                if(sum == 0){
                    int[] out = {nums[i], nums[left], nums[right]};
                    System.out.println(Arrays.toString(out));
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
