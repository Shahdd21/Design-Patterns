package ultimate;

public class AuthorizationMiddleware extends AbstractMiddlewareHandler{

    public MiddlewareResponse handle(HttpRequest httpRequest) {


        if(httpRequest.getUser().isAuthorized()){
            System.out.println("we're in the authorization middleware");
            return super.handle(httpRequest);
        }

        return new MiddlewareResponse("Request has failed to be authorized", false);
    }
}
