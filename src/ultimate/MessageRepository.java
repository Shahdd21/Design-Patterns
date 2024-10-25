package ultimate;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    private List<String> messages;

    public MessageRepository() {
        messages = new ArrayList<>();
    }

    public void addMessage(String message){
        messages.add(message);
    }
}
