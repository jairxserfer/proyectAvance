package users;

public class User {
    String password;
    int currentId;

    public User(String password, int currentId) {
        this.password = password;
        this.currentId = currentId;
    }

    public String getPassword() {
        return password;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public void add(){

    }

    public boolean existingUser(){
        return false;
    }

    public boolean existingName(){
        return false;
    }

    public void startSession(){

    }

    public static void outSession(){

    }
}
