package elements;

public class DirectoryOS {
    String name, rute, location, parent, son;
    FilesOS filesOS;

    public DirectoryOS(String name, String rute, String location, String parent, String son, FilesOS filesOS) {
        this.name = name;
        this.rute = rute;
        this.location = location;
        this.parent = parent;
        this.son = son;
        this.filesOS = filesOS;
    }

    public DirectoryOS(String name, String rute, String location, String parent, String son) {
        this.name = name;
        this.rute = rute;
        this.location = location;
        this.parent = parent;
        this.son = son;
    }

    public DirectoryOS(String name, String rute, String location, String parent) {
        this.name = name;
        this.rute = rute;
        this.location = location;
        this.parent = parent;
    }

    public DirectoryOS(String name, String rute, String location) {
        this.name = name;
        this.rute = rute;
        this.location = location;
    }

    public DirectoryOS(String name, String rute) {
        this.name = name;
        this.rute = rute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public FilesOS getFilesOS() {
        return filesOS;
    }

    public void setFilesOS(FilesOS filesOS) {
        this.filesOS = filesOS;
    }
}
