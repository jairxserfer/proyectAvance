package users;

public class Administrator extends User{
    boolean permissionW, permissionR;

    public Administrator(String password, int currentId) {
        super(password, currentId);
    }

    public Administrator(String password, int currentId, boolean permissionW, boolean permissionR) {
        super(password, currentId);
        this.permissionW = permissionW;
        this.permissionR = permissionR;
    }

    public boolean isPermissionW() {
        return permissionW;
    }

    public void setPermissionW(boolean permissionW) {
        this.permissionW = permissionW;
    }

    public boolean isPermissionR() {
        return permissionR;
    }

    public void setPermissionR(boolean permissionR) {
        this.permissionR = permissionR;
    }
}
