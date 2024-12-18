package project.entity;

public class C_Task {
    private int taskID;
    private String taskName;
    private String taskDes;

    public C_Task() {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDes = taskDes;
    }

    public int gettaskID() {
        return taskID;
    }

    public void settaskID(int taskID) {
        this.taskID = taskID;
    }

    public String gettaskName() {
        return taskName;
    }

    public void settaskName(String taskName) {
        this.taskName = taskName;
    }

    public String gettaskDes() {
        return taskDes;
    }

    public void settaskDes(String taskDes) {
        this.taskDes = taskDes;
    }

    @Override
    public String toString() {
        return "C_Task{" +
                "taskID=" + taskID +
                ", taskName='" + taskName + '\'' +
                ", taskDes='" + taskDes + '\'' +
                '}';
    }
}
