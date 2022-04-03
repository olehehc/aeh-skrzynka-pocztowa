package factory;

public class Photo implements Attachment {

    private int size;
    private int width;
    private int height;
    private String name;
    private String extension;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        return "factory.Photo{" +
                "size=" + size +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
