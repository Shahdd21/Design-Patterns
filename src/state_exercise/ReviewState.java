package state_exercise;

public class ReviewState implements TaskState{
    private final TaskManagement taskManagement;

    public ReviewState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("The task can't be picked right now");
    }

    @Override
    public void progressTask() {
        System.out.println("The task can't be progressed right now");
    }

    @Override
    public void blockTask() {
        System.out.println("The task can't be blocked right now");
    }

    @Override
    public void reviewTask() {
        System.out.println("The is currently being reviewed");
    }

    @Override
    public void finishTask() {
        System.out.println("The task is done");
        taskManagement.changeState(new DoneState(taskManagement));
    }
}
