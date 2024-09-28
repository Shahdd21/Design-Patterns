package observer_exercise;

public class blogPost{
    private String title;
    private String topic;

    public blogPost() {}
    public blogPost(String title, String topic){
        this.title = title;
        this.topic = topic;
    }

    public String getTitle(){ return title; }
    public String getTopic(){ return topic;}
}