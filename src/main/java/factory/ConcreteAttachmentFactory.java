package factory;

public class ConcreteAttachmentFactory extends AttachmentFactory {

    @Override
    public Attachment crateAttachment(AttachmentType type) {
        return switch (type) {
            case ARCHIVE -> new Archive();
            case FILE -> new File();
            case PHOTO -> new Photo();
        };
    }

}
