package state_exercise;

public class InProgressState implements TaskState{
    private final TaskManagement taskManagement;

    public InProgressState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("The task is already picked and in-progress");
    }

    @Override
    public void progressTask() {
        System.out.println("The task is already in-progress");

    }

    @Override
    public void blockTask() {
        System.out.println("Blocking the task now");
        taskManagement.changeState(new BlockState(taskManagement));
    }

    @Override
    public void reviewTask() {
        System.out.println("The task is getting reviewed");
        taskManagement.changeState(new ReviewState(taskManagement));
    }

    @Override
    public void finishTask() {
        System.out.println("Not finished. Still in-progress");

    }
}
