package elements;

public class FilesOS {
    String name, location, size, type, creationDate, modificationDate;

    public FilesOS(String name, String location, String size, String type, String creationDate, String modificationDate) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.type = type;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public FilesOS(String name, String location, String size, String type, String creationDate) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.type = type;
        this.creationDate = creationDate;
    }

    public FilesOS(String name, String location, String size, String type) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.type = type;
    }

    public FilesOS(String name, String location, String size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }
}
