package state_exercise;

public class BlockState implements TaskState{
    private final TaskManagement taskManagement;

    public BlockState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("The task is blocked");
    }

    @Override
    public void progressTask() {
        System.out.println("The task is blocked");
    }

    @Override
    public void blockTask() {
        System.out.println("The task is already blocked");
    }

    @Override
    public void reviewTask() {
        System.out.println("The task is blocked");
    }

    @Override
    public void finishTask() {
        System.out.println("The task is blocked");
    }
}
