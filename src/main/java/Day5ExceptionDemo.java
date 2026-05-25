public class Day5ExceptionDemo {
    public static void main(String[] args) {
        try {
            addTask("Learn Java IO");
        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addTask(String task){
        if(task == null || task.isEmpty()){
            throw new InvalidTaskException("任务标题不能为空");
        }
        else{
            System.out.println("添加任务：" + task);
        }
    }
}
