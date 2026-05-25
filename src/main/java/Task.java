public class Task {
    private int id;
    private String title;
    private boolean completed;
    private int priority;

    public Task(int id, String title, boolean completed, int priority){
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.priority = priority;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isCompleted(){
        return completed;
    }
    public int getPriority(){
        return priority;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
}
