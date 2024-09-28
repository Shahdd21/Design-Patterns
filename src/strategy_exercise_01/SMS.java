package strategy_exercise_01;

public class SMS implements NotificationService{

    @Override
    public void sendNotification(User toUser,User fromUser, String message) {
        System.out.println("Via SMS:");
        System.out.println("Sending to "+ toUser.getName()+" from "+ fromUser.getName()+" this message: "+ message);
    }
}
