public class ArrayUtilsForTest {
    public static int max(int[] nums){
        int max = nums[0];
        for(int i = 1;i < nums.length;i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int sum(int[] nums){
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
}
