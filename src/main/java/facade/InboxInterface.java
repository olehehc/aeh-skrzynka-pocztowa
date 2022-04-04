package facade;

import adapter.JsonAdapter;
import adapter.XmlAdapter;
import adapter.parser.JsonParser;
import adapter.parser.XmlParser;
import factory.*;
import factory.attachment.Attachment;
import factory.attachment.AFile;
import factory.attachment.Photo;
import singleton.Inbox;
import singleton.entity.Message;

import java.io.File;

import static factory.AttachmentFactory.AttachmentType.FILE;
import static factory.AttachmentFactory.AttachmentType.PHOTO;

// use of facade
public class InboxInterface {

    public static void manageInbox() {
        // use of singleton and factory
        var attachmentFactory = new ConcreteAttachmentFactory();

        var photo = (Photo) attachmentFactory.crateAttachment(PHOTO);
        photo.setName("factory.attachment.Photo");
        photo.setExtension("png");
        photo.setWidth(1920);
        photo.setHeight(1080);
        photo.setSize(1000);

        var file = (AFile) attachmentFactory.crateAttachment(FILE);
        file.setName("factory.attachment.File");
        file.setExtension("txt");
        file.setSize(60);

        var messageAttachments = new Attachment[]{photo, file};

        var inbox = Inbox.getInstance();
        var message = new Message("First message", "Hello, World !", messageAttachments);

        var messageId = inbox.addMessage(message);

        System.out.println(inbox.removeMessage(messageId));

        // use of adapter
        var messageXmlAdapter = new XmlAdapter(new XmlParser());
        var messageJsonAdapter = new JsonAdapter(new JsonParser());

        System.out.println(messageXmlAdapter.getMessages(new File(System.getProperty("user.dir")
                + "/src/main/resources/messages.xml")));
        System.out.println(messageJsonAdapter.getMessages(new File(System.getProperty("user.dir")
                + "/src/main/resources//messages.json")));
    }

}
