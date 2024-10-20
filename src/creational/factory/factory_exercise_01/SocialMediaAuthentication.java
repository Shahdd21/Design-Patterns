package creational.factory.factory_exercise_01;

public class SocialMediaAuthentication implements Authentication{
    @Override
    public void authenticate() {
        System.out.println("Authenticating using Social Media");
    }
}
