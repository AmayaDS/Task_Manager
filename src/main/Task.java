package main;

//task class
public class Task {
    private int taskId;
    private String title;
    private String description;
    private String priority;
    private String dueDate;
    
    public Task(int taskId,String title, String description, String priority, String dueDate){
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }
	
	public int getTaskId(){
        return taskId;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getPriority(){
        return priority;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void setTaskId(int taskId){
        this.taskId=taskId;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    
    @Override
    public String toString() {
        return "TaskID: " + taskId + "\nTitle: " + title + "\nDescription: " + description + "\nPriority: " + priority + "\nDue Date: " + dueDate;
    }
    
    
}
