package elements;

import explorer.LoginInterface;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.Serializable;
import java.util.LinkedList;

public class ExplorerOS implements Serializable {
    static LinkedList id_jumps = new LinkedList();
    private static int currentId= 1, currentLevel = 1;
    public static Document tree, userTree;
    public static Element currentDir, pasteElement, currentUser, usersContainer;
    public static boolean pasteState = false;
    public static String Direction = "C://";

    public static String getDirection(){
        return Direction;
    }

    public static void setDirection(String direction) {
        Direction = direction;
    }

    public static LinkedList getId_jumps() {
        return id_jumps;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ExplorerOS.currentId = currentId;
    }

    public static int getCurrentLevel() {
        return currentLevel;
    }

    public static void setCurrentLevel(int currentLevel) {
        ExplorerOS.currentLevel = currentLevel;
    }

    public static void inicializar(){

    }
    public static void main(String[] args){
        inicializar();
        LoginInterface loginInterface = new LoginInterface();
    }
}
