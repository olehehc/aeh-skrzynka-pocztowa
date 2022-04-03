package factory;

import java.util.Arrays;

public class Message {

    private String messageText;
    private Attachment[] attachment;

    public Message(String messageText, Attachment[] attachment) {
        this.messageText = messageText;
        this.attachment = attachment;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Attachment[] getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment[] attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "factory.Message{" +
                "messageText='" + messageText + '\'' +
                ", attachment=" + Arrays.toString(attachment) +
                '}';
    }
}
