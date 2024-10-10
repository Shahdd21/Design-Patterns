package behavioral.strategy.strategy_exercise_01;

public class User {
    private String name;
    private NotificationService notificationService;

    public User(){

    }

    public User(String name, NotificationService notificationService) {
        this.name = name;
        this.notificationService = notificationService;
    }

    public String getName() {
        return name;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void sendNotification(User user, String message){
        notificationService.sendNotification(user,this,message);
    }
}
