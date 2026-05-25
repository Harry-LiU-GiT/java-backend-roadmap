import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsForTestTest {
    @Test
    public void testSum(){
        int[] nums = {1, 2, 3};
        int result = ArrayUtilsForTest.sum(nums);
        assertEquals(6, result);
    }

    @Test
    public void testMax(){
        int[] nums = {1, 2, 3};
        int result = ArrayUtilsForTest.max(nums);
        assertEquals(3, result);
    }
}
