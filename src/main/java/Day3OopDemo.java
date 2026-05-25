public class Day3OopDemo {
    public static void main(String[] args){
        User man = new User(1, "Harry", 20);
        System.out.println(man.getId());
        System.out.println(man.getUsername());
        System.out.println(man.getAge());
        man.setAge(21);
        System.out.println(man.getAge());
        Order order1 = new Order(1001, 1, 99.9);
        System.out.println(order1.getId());
        System.out.println(order1.getUserId());
        System.out.println(order1.getAmount());
        order1.setAmount(129.9);
        System.out.println(order1.getAmount());
        Task task1 = new Task(1, "Learn OOP", false, 3);
        System.out.println(task1.getId());
        System.out.println(task1.getTitle());
        System.out.println(task1.isCompleted());
        System.out.println(task1.getPriority());
        task1.setCompleted(true);
        task1.setPriority(1);
        System.out.println(task1.isCompleted());
        System.out.println(task1.getPriority());
        FileInfo fileinfo = new FileInfo(1, "user.csv", "csv", 1024);
        fileinfo.setSize(2048);
        System.out.println(fileinfo.getSize());
        fileinfo.printInfo();
        printAny(man);
        printAny(fileinfo);
    }

    public static void printAny(Printable item){
        item.printInfo();
    }
}
