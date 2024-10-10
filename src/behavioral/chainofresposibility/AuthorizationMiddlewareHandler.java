package behavioral.chainofresposibility;

public class AuthorizationMiddlewareHandler extends AbstractMiddlewareHandler{

    @Override
    public boolean handle(Request request) {

        if(!request.isAuthorized()) return false;

        return super.handle(request);
    }
}
