package creational.builder;

import java.util.List;

public interface NotificationBuilder {
    NotificationBuilder setContent(String content);
    NotificationBuilder setSender(String sender);
    NotificationBuilder setRecipient(String recipient);
    NotificationBuilder setTimestamp(String timestamp);
    NotificationBuilder setTheme(String theme);
    NotificationBuilder setAttachments(List<String> attachments);

}
