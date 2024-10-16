package creational.builder;

import java.util.List;

public class SlackNotification {
    private String content;
    private String sender;
    private String recipient ;
    private String timestamp;
    private String theme;
    private List<String> attachments;

    SlackNotification(SlackNotificationBuilder slackNotificationBuilder){
        this.content = slackNotificationBuilder.getContent();
        this.sender = slackNotificationBuilder.getSender();
        this.recipient = slackNotificationBuilder.getRecipient();
        this.timestamp = slackNotificationBuilder.getTimestamp();
        this.theme = slackNotificationBuilder.getTheme();
        this.attachments = slackNotificationBuilder.getAttachments();
    }

    public String getContent() {
        return content;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public String getTheme() {
        return theme;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
}
