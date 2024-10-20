package creational.factory.factory_exercise_01;

public class TwoFactorAuthentication implements Authentication{
    @Override
    public void authenticate() {
        System.out.println("Authenticating using Two factor authentication");
    }
}
