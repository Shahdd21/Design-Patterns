package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class onlineMarketPlace {
    private ArrayList<Product> products;
    private HashMap<EvenType,ArrayList<Subscriber>> subscribers;
    private ArrayList<Offer> offers;

    public onlineMarketPlace(){
        products = new ArrayList<Product>();
        subscribers = new HashMap<>();
        initSubscribers();
        offers = new ArrayList<Offer>();
    }

    private void initSubscribers(){
        subscribers.put(EvenType.JOB_OPENING,new ArrayList<>());
        subscribers.put(EvenType.NEW_OFFER,new ArrayList<>());
        subscribers.put(EvenType.NEW_PRODUCT,new ArrayList<>());
    }

    public void addProduct(Product product){
        products.add(product);
        notifySubscriber(EvenType.NEW_PRODUCT, "New product is added: "+ product.getName());
    }

    public void notifySubscriber(EvenType evenType, String message){
        subscribers.get(evenType).forEach(subscriber -> subscriber.notify(message));
    }

    public void addOffer(Offer offer){
        offers.add(offer);
        notifySubscriber(EvenType.NEW_OFFER, "New offer is here! "+offer.getMessage());
    }

    public void addJobPosition(String jobTitle){
        notifySubscriber(EvenType.JOB_OPENING, "New available position: "+ jobTitle);
    }

    public void subscribe(EvenType evenType, Subscriber subscriber){
        subscribers.get(evenType).add(subscriber);
    }

    public void unsubscribe(EvenType evenType, Subscriber subscriber){
        subscribers.get(evenType).remove(subscriber);
    }
}
