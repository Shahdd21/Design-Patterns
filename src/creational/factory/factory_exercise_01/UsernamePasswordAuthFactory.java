package creational.factory.factory_exercise_01;

public class UsernamePasswordAuthFactory implements AuthenticationFactory{
    @Override
    public Authentication createAuthentication() {
        return new UsernamePasswordAuthentication();
    }
}
