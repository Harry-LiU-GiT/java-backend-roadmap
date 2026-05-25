public class User implements Printable {
    private int id;
    private String username;
    private int age;

    public void printInfo(){
        System.out.println(id + " " + username + " " + age);
    }

    public User(int id, String username, int age){
        this.id = id;
        this.username = username;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public int getAge(){
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setAge(int age){
        this.age = age;
    }
}
