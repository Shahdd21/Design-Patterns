package behavioral.observer;

public class JobFinder implements Subscriber{
    private String name;

    public JobFinder() {}

    public JobFinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notify(String message) {
        System.out.println("For "+name+", New open position: "+message);
    }
}
