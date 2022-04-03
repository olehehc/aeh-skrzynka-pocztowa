package factory;

import factory.attachment.Attachment;

public abstract class AttachmentFactory {

    public enum AttachmentType {
        ARCHIVE, PHOTO, FILE
    }

    public abstract Attachment crateAttachment(AttachmentType type);

}
