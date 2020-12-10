package elements;

import explorer.FileExplorer;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.swing.*;

public class FileOS extends ElementOS {
    private String content, boos;
    private boolean reading, edition;

    public FileOS(int id, String name, String type, String content, String boos, boolean reading, boolean edition) {
        super(id, name, type);
        this.content = content;
        this.boos = boos;
        this.reading = reading;
        this.edition = edition;
    }

    public String getContent() {
        return content;
    }

    public void add(){
        Element file = ExplorerOS.tree.createElement("file");
        ExplorerOS.currentDir.appendChild(file);

        Attr attr = ExplorerOS.tree.createAttribute("id");
        if(ExplorerOS.id_jumps.isEmpty()){
            attr.setValue(String.valueOf(ExplorerOS.getCurrentId()));
            ExplorerOS.setCurrentId(ExplorerOS.getCurrentId() + 1);
        } else {
            attr.setValue(String.valueOf(ExplorerOS.id_jumps.get(0)));
            ExplorerOS.id_jumps.remove(0);
        }
        file.setAttributeNode(attr);

        Attr attrName = ExplorerOS.tree.createAttribute("name");
        attrName.setValue(this.getName());
        file.setAttributeNode(attrName);

        Attr attrBoos = ExplorerOS.tree.createAttribute("boos");
        attrBoos.setValue(this.getBoos());
        file.setAttributeNode(attrBoos);

        Attr attrReading = ExplorerOS.tree.createAttribute("reading");
        attrReading.setValue(edition ? "Public" : "Private");
        file.setAttributeNode(attrReading);

        Attr attrWriting = ExplorerOS.tree.createAttribute("writing");
        attrWriting.setValue(edition ? "Public" : "Private");
        file.setAttributeNode(attrWriting);

        Attr attrContent = ExplorerOS.tree.createAttribute("content");
        attrContent.setValue(this.getContent());
        file.setAttributeNode(attrContent);


    }

    public void edit(){

    }

    public static Element obtainSoonNode(String name){
        NodeList soons = ExplorerOS.currentDir.getChildNodes();
        for (int i = 0; i < soons.getLength(); i++){
            if(soons.item(i).getNodeName().equals("file") && soons.item(i).getAttributes().getNamedItem("name").getTextContent().equals(name))
                return (Element) soons.item(i);
        }
        return null;
    }

    public void clonee(){
        ExplorerOS.currentDir.appendChild(ExplorerOS.pasteElement.cloneNode(true));

    }

    public boolean isReading(){
        return reading;
    }

    public boolean isEdition(){
        return edition;
    }

    public String getBoos(){
        return  boos;
    }
}
