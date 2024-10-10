package behavioral.state_exercise;

public class Task {
    private String name;
    private String ID ;

    public Task(String name,String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
