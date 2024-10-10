package behavioral.state_exercise;

public class TodoState implements TaskState{
    private final TaskManagement taskManagement;

    public TodoState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("The task is already picked. It's in the To-Do list");
    }

    @Override
    public void progressTask() {
        System.out.println("The task is getting progressed now");
        taskManagement.changeState(new InProgressState(taskManagement));

    }

    @Override
    public void blockTask() {
        System.out.println("Can't block the task as it is not progressed yet. It's in the To-Do list");

    }

    @Override
    public void reviewTask() {
        System.out.println("No reviews yet. It's in the To-Do list");

    }

    @Override
    public void finishTask() {
        System.out.println("Absolutely not finished. It's in the To-Do list");

    }
}
