package chainofresposibility;

public class RequestProcessor {

    private final MiddlewareHandler middlewareHandlerChain;

    public RequestProcessor(MiddlewareHandler middlewareHandlerChain) {
        this.middlewareHandlerChain = middlewareHandlerChain;
    }

    public Response processRequest(Request request){

        if(!middlewareHandlerChain.handle(request))
            return new Response("Failed Processing", false);

        System.out.println("Processing");
        return new Response("Successful processing", true);
    }
}
