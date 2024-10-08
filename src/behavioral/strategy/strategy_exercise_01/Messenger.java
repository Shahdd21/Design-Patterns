package behavioral.strategy.strategy_exercise_01;

public class Messenger implements NotificationService{
    @Override
    public void sendNotification(User toUser, User fromUser, String message) {
        System.out.println("Via Messenger:");
        System.out.println("Sending to "+ toUser.getName()+" from "+ fromUser.getName()+" this message: "+ message);
    }
}
