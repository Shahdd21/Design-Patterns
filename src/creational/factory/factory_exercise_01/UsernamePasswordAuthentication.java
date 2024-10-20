package creational.factory.factory_exercise_01;

public class UsernamePasswordAuthentication implements Authentication{
    @Override
    public void authenticate() {
        System.out.println("Authenticating using Username and password");
    }
}
