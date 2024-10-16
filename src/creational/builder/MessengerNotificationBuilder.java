package creational.builder;

import java.util.List;

public class MessengerNotificationBuilder implements NotificationBuilder{

    private String content;
    private String sender;
    private String recipient ;
    private String timestamp;
    private String theme;
    private List<String> attachments;

    @Override
    public MessengerNotificationBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    public MessengerNotification build(){
        return new MessengerNotification(this);
    }

    public String getContent() {
        return content;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTheme() {
        return theme;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}
