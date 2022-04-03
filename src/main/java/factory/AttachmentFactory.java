package factory;

public abstract class AttachmentFactory {

    enum AttachmentType {
        ARCHIVE, PHOTO, FILE
    }

    public abstract Attachment crateAttachment(AttachmentType type);

}
