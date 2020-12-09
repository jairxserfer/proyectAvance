package elements;

public class DirectoryOS extends FileOS {
    String son, parent;

    public DirectoryOS(String name, String location, int size, String son, String parent) {
        super(name, location, size);
        this.son = son;
        this.parent = parent;
    }

    public DirectoryOS(String name, String location, int size) {
        super(name, location, size);
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
