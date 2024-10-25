package ultimate;

public class HttpResponse {
    private Integer statusCode;
    private String responseBody;
    private String errorMessage;
    private boolean hasErrors;

    private HttpResponse(int statusCode, boolean hasErrors, String errorMessage, String responseBody) {
        this.statusCode = statusCode;
        this.hasErrors = hasErrors;
        this.errorMessage = errorMessage;
        this.responseBody = responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public static class HttpResponseBuilder{
        private Integer statusCode;
        private String responseBody;
        private String errorMessage;
        private boolean hasErrors;

        public HttpResponseBuilder setStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public HttpResponseBuilder setHasErrors(boolean hasErrors) {
            this.hasErrors = hasErrors;
            return this;
        }

        public HttpResponseBuilder setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public HttpResponseBuilder setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }

        public HttpResponse build(){
            if(statusCode == null)
                throw new NullPointerException("Status code can not be null");

            if(responseBody == null)
                throw new NullPointerException("Response body can not be null");

            return new HttpResponse(statusCode,hasErrors,errorMessage,responseBody);
        }
    }
}
