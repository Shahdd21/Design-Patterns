package ultimate;

public class MessageServiceFacade {
    private MessageFormaterTemplate messageFormatter;
    private MessageAnalyzer messageAnalyzer;
    private MessageRepository messageRepository;
    private ThirdPartyAPIProxy thirdPartyAPIProxy;

    public MessageServiceFacade() {
        messageFormatter = new JsonMessageFormatter();
        messageAnalyzer = new MessageAnalyzer();
        messageRepository = new MessageRepository();
        thirdPartyAPIProxy = new ThirdPartyAPICachingProxy(new ThirdPartyAPI());
    }

    public void handleMessage(String message){
        messageAnalyzer.analyzeMessage(message);
        Text formattedMessage = messageFormatter.formatMessage(new JsonText(message));
        messageAnalyzer.analyzeMessage(formattedMessage.getContent());
        messageRepository.addMessage(formattedMessage.getContent());
        thirdPartyAPIProxy.processMessage(formattedMessage.getContent());
    }
}
