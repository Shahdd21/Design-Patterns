package behavioral.state_exercise;

public class TaskManagement {
    private Task task;
    private TaskState taskState;

    public TaskManagement(Task task) {
        this.task = task;
        this.taskState = new BacklogState(this);
    }

    public void changeState(TaskState changedState){
        taskState = changedState;
    }

    public void pickTask(){
        taskState.pickTask();
    }

    void progressTask(){
        taskState.progressTask();
    }
    void blockTask(){
        taskState.blockTask();
    }
    void reviewTask(){
        taskState.reviewTask();
    }
    void finishTask(){
        taskState.finishTask();
    }
}
