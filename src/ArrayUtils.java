public class ArrayUtils {
    public static void main(String[] args){
    int[] nums = {3, 8, 2, 10, 5};
    System.out.println(max(nums));
    System.out.println(sum(nums));
    }
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
