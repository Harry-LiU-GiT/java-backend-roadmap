import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args){
    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums){
        int insert_pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[insert_pos] = nums[i];
                insert_pos += 1;
            }
        }
        for(int i = insert_pos; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
