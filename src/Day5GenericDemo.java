public class Day5GenericDemo {
    public static void main(String[] args){
        String[] names = {"Harry", "Alice", "Bob"};
        Integer[] nums = {1, 2, 3};
        printArray(names);
        printArray(nums);
    }
    public static <T> void printArray(T[] array){
        for(T object : array){
            System.out.println(object);
        }
    }
}
