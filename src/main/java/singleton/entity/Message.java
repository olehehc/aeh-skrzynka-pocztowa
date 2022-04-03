package singleton.entity;

import factory.attachment.Attachment;

import java.util.Arrays;

public class Message {

    private String messageHeader;
    private String messageText;
    private Attachment[] attachment;

    public Message(String messageHeader, String messageText, Attachment[] attachment) {
        this.messageHeader = messageHeader;
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

    public String getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(String messageHeader) {
        this.messageHeader = messageHeader;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageHeader='" + messageHeader + '\'' +
                ", messageText='" + messageText + '\'' +
                ", attachment=" + Arrays.toString(attachment) +
                '}';
    }
}
