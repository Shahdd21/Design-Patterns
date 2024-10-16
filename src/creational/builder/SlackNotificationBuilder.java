package creational.builder;

import java.util.List;

public class SlackNotificationBuilder implements NotificationBuilder{
    private String content;
    private String sender;
    private String recipient ;
    private String timestamp;
    private String theme;
    private List<String> attachments;


    @Override
    public SlackNotificationBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public SlackNotificationBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public SlackNotificationBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public SlackNotificationBuilder setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public SlackNotificationBuilder setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public SlackNotificationBuilder setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    public SlackNotification build(){
        return new SlackNotification(this);
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
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