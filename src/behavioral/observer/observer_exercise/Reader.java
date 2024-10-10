package behavioral.observer.observer_exercise;

public class Reader implements Subscriber{
    private String name;

    public Reader(){}
    public Reader(String name){
        this.name = name;
    }

    public String getName(){ return name; }

    public void notify(String message){
        System.out.println("Notifing "+ getName()+" about: "+ message);
    }
}
