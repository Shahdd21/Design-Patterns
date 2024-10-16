package creational.builder;

import java.util.List;

public class MessengerNotification {
    private String content;
    private String sender;
    private String recipient ;
    private String timestamp;
    private String theme;
    private List<String> attachments;

    MessengerNotification(MessengerNotificationBuilder messengerNotificationBuilder){
        this.content = messengerNotificationBuilder.getContent();
        this.sender = messengerNotificationBuilder.getSender();
        this.recipient = messengerNotificationBuilder.getRecipient();
        this.timestamp = messengerNotificationBuilder.getTimestamp();
        this.theme = messengerNotificationBuilder.getTheme();
        this.attachments = messengerNotificationBuilder.getAttachments();
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
