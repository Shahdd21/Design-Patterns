package state_exercise;

public class DoneState implements TaskState{
    private final TaskManagement taskManagement;

    public DoneState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void pickTask() {
        System.out.println("Can't pick task. It's finished");
    }

    @Override
    public void progressTask() {
        System.out.println("Can't progress task. It's finished");
    }

    @Override
    public void blockTask() {
        System.out.println("Can't block task. It's finished");
    }

    @Override
    public void reviewTask() {
        System.out.println("Can't review task. It's finished");
    }

    @Override
    public void finishTask() {
        System.out.println("It's already finished");
    }
}
