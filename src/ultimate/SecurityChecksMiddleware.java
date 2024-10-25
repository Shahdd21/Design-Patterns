package ultimate;

public class SecurityChecksMiddleware extends AbstractMiddlewareHandler{

    public MiddlewareResponse handle(HttpRequest httpRequest) {

        if(httpRequest.getUser().hasPassedSecurityChecks()){
            System.out.println("we're in the security checks middleware");
            return super.handle(httpRequest);
        }

        return new MiddlewareResponse("Request has failed to pass security checks", false);
    }
}
