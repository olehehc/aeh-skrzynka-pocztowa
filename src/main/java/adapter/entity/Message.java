package adapter.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    private String messageHeader;
    private String messageText;

    public Message(
        @JsonProperty("messageHeader") String messageHeader,
        @JsonProperty("messageText") String messageText
    ) {
        this.messageHeader = messageHeader;
        this.messageText = messageText;
    }

    public String getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(String messageHeader) {
        this.messageHeader = messageHeader;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageHeader='" + messageHeader + '\'' +
                ", messageText='" + messageText + '\'' +
                '}';
    }

}
