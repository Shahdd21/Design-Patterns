import observer_exercise.*;
import strategy.*;
import strategy_exercise_01.Messenger;
import strategy_exercise_01.SMS;
import strategy_exercise_01.Slack;
import strategy_exercise_01.User;

public class Main {
    public static void main(String[] args) {
        User shahd = new User("Shahd", new Slack());
        User rowan = new User("Rowan", new Messenger());
        User camillia = new User("Camilia", new SMS());

        shahd.sendNotification(rowan,"Long time no see !!");
        rowan.sendNotification(shahd,"I miss youuuuu");
        camillia.sendNotification(shahd,"we need to meet !!");

        String message = "ksdflsdjfsd;lfj";
        
    }
}