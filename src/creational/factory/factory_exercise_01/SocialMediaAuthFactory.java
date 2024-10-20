package creational.factory.factory_exercise_01;

public class SocialMediaAuthFactory implements AuthenticationFactory{
    @Override
    public Authentication createAuthentication() {
        return new SocialMediaAuthentication();
    }
}
