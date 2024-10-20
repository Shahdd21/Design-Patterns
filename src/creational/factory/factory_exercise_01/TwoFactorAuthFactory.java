package creational.factory.factory_exercise_01;

public class TwoFactorAuthFactory implements AuthenticationFactory{
    @Override
    public Authentication createAuthentication() {
        return new  TwoFactorAuthentication();
    }
}
