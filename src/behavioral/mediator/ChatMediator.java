package behavioral.mediator;

public interface ChatMediator {
    void sendDirectMessage(String message, User fromUser, User toUser);
    void sendGroupMessage(String message, User fromUser, String groupName);
    void registerUserIntoGroup(User user, String groupName);
}
