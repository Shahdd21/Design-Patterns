package chainofresposibility;

public class SecurityChecksMiddlewareHandler extends AbstractMiddlewareHandler{

    @Override
    public boolean handle(Request request) {

        if(!request.hasPassedSecurityChecks()) return false;

        return super.handle(request);
    }
}
