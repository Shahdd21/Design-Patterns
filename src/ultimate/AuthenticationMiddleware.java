package ultimate;

public class AuthenticationMiddleware extends AbstractMiddlewareHandler{

    public MiddlewareResponse handle(HttpRequest httpRequest) {

        if(httpRequest.getUser().isAuthenticated()){
            System.out.println("we're in the authentication middleware");
            return super.handle(httpRequest);
        }
        return new MiddlewareResponse("Request has failed to be authenticated", false);
    }
}
