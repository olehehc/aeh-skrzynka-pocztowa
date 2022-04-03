package factory;

import factory.attachment.Archive;
import factory.attachment.Attachment;
import factory.attachment.AFile;
import factory.attachment.Photo;

public class ConcreteAttachmentFactory extends AttachmentFactory {

    @Override
    public Attachment crateAttachment(AttachmentType type) {
        return switch (type) {
            case ARCHIVE -> new Archive();
            case FILE -> new AFile();
            case PHOTO -> new Photo();
        };
    }

}
