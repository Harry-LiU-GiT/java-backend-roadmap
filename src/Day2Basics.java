public class Day2Basics {
    public static void main(String[] args){
        System.out.println("Day 2 - Array and String Practice");
        int[] nums = {3, 8, 2, 10, 5};
        String s = "hello java";
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" ");
        sb.append("Backend");
        sb.append(" ");
        sb.append("Day ");
        sb.append("2");
        System.out.println(sb);
        System.out.println(max(nums));
        System.out.println(sum(nums));
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
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
