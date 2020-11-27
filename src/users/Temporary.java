package users;

public class Temporary extends User{
    boolean  permissionR;
    public Temporary(String password, int currentId) {
        super(password, currentId);
    }

    public Temporary(String password, int currentId, boolean permissionR) {
        super(password, currentId);
        this.permissionR = permissionR;
    }

    public boolean isPermissionR() {
        return permissionR;
    }

    public void setPermissionR(boolean permissionR) {
        this.permissionR = permissionR;
    }
}
