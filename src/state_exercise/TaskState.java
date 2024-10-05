package state_exercise;

public interface TaskState {

    void pickTask();
    void progressTask();
    void blockTask();
    void reviewTask();
    void finishTask();
}
