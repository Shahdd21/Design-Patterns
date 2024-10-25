package ultimate;

public class MessageController {
    private final MiddlewareHandler middlewareHandler;
    private MessageServiceFacade messageServiceFacade;


    public MessageController(MiddlewareHandler middlewareHandler) {
        this.middlewareHandler = middlewareHandler;
        messageServiceFacade = new MessageServiceFacade();
    }

    public HttpResponse processRequest(HttpRequest httpRequest){
        MiddlewareResponse middlewareResponse = middlewareHandler.handle(httpRequest);

        if(!middlewareResponse.hasSucceeded()) {

            return new HttpResponse.HttpResponseBuilder()
                    .setStatusCode(400)
                    .setErrorMessage("It failed some of the middlewares")
                    .setHasErrors(true)
                    .build();
        }

        messageServiceFacade.handleMessage(middlewareResponse.getMessage());

        return new HttpResponse.HttpResponseBuilder()
                .setStatusCode(200)
                .setHasErrors(false)
                .setResponseBody("Passed all the middlewares successfully !")
                .build();
    }
}
