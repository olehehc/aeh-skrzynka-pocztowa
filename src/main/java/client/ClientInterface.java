package client;

public class ClientInterface {

    public static void main(String[] args) {
        var attachmentFactory = new ConcreteAttachmentFactory();

        var photo = attachmentFactory.crateAttachment(PHOTO);
        photo.setName("factory.Photo");
        photo.setExtension("png");
        photo.setWidth(1920);
        photo.setHeight(1080);
        photo.setSize(1000);

        var file = attachmentFactory.crateAttachment(FILE);
        file.setName("factory.File");
        file.setExtension("txt");
        file.setSize(60);

        var messageAttachments = new Attachment[]{photo, file};

        var inbox = Inbox.getInstance();
        var message = new Message("First message", messageAttachments);

        var messageId = inbox.addMessage(message);

        System.out.println(inbox.removeMessage(messageId));
    }

}
