package factory.attachment;

public class Archive implements Attachment {

    private int size;
    private String name;
    private String extension;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "factory.attachment.Archive{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
