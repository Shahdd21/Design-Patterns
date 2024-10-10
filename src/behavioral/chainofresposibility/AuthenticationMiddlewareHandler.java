package behavioral.chainofresposibility;

public class AuthenticationMiddlewareHandler extends AbstractMiddlewareHandler{

    @Override
    public boolean handle(Request request) {

        if(!request.isAuthenticated()) return false;

        return super.handle(request);
    }
}
