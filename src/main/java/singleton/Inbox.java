package singleton;

import factory.Message;

import java.util.HashMap;

public class Inbox {

    private static Inbox instance;

    private final Map<Integer, Message> messages = new HashMap<>();

    private Inbox() {
    }

    public static Inbox getInstance() {
        if (instance == null) {
            instance = new Inbox();
        }

        return instance;
    }

    public int addMessage(Message messageText) {
        int count = messages.size() + 1;
        messages.put(count, messageText);
        return count;
    }

    public Message removeMessage(int messageId) {
        return messages.remove(messageId);
    }

}
