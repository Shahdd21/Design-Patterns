package behavioral.state_exercise;

public class BacklogState implements TaskState{

    private final TaskManagement taskManagement;

    public BacklogState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("This task is getting picked from the backlog now");
        taskManagement.changeState(new TodoState(taskManagement));
    }

    @Override
    public void progressTask() {
        System.out.println("The task is not in progress. It's in the backlog");

    }

    @Override
    public void blockTask() {
        System.out.println("Can't block the task. The task is already in the backlog");

    }

    @Override
    public void reviewTask() {
        System.out.println("There's no task to review. It's in the backlog");

    }

    @Override
    public void finishTask() {
        System.out.println("Absolutely not finished. It's in the backlog");
    }
}
