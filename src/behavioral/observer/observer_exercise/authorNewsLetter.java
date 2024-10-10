package behavioral.observer.observer_exercise;

import java.util.*;

public class authorNewsLetter{

    Map<Interest, ArrayList<Subscriber>> subscribers;
    ArrayList<blogPost> blogPosts;
    ArrayList<newsLetter> newsLetters ;

    public authorNewsLetter(){
        blogPosts = new ArrayList<>();
        subscribers = new HashMap<>();
        initSubscribers();
        newsLetters = new ArrayList<>();
    }

    private void initSubscribers(){
        subscribers.put(Interest.BLOG_POST, new ArrayList<>());
        subscribers.put(Interest.NEWSLETTER, new ArrayList<>());
    }

    public void subscribe(Interest interest, Subscriber subscriber){
        subscribers.get(interest).add(subscriber);
    }

    public void unsubscribe(Interest interest, Subscriber subscriber){
        subscribers.get(interest).remove(subscriber);
    }

    public void addPost(blogPost post){
        blogPosts.add(post);
        notifySubscribers(Interest.BLOG_POST, "New Post is uploaded ! "+ post.getTitle()+" Topic: "+ post.getTopic());
    }

    public void addNewsletter(newsLetter newsletter){
        newsLetters.add(newsletter);
        notifySubscribers(Interest.NEWSLETTER, "New Newsletter arrived ! "+ newsletter.getTitle());
    }

    private void notifySubscribers(Interest interest, String message){
        subscribers.get(interest).forEach(subscriber -> subscriber.notify(message) );
    }
}
