package elementaryFunctions;

import elements.DirectoryOS;
import elements.FilesOS;

import java.util.ArrayList;
import java.util.Collections;

public class Order {
    ArrayList<DirectoryOS> directoryOS;
    ArrayList<FilesOS> filesOS;

    public Order(ArrayList<DirectoryOS> directoryOS, ArrayList<FilesOS> filesOS) {
        this.directoryOS = directoryOS;
        this.filesOS = filesOS;
    }

    public Order(ArrayList<DirectoryOS> directoryOS) {
        this.directoryOS = directoryOS;
    }

    public void orderByDirectory(){
        DirectoryOS buffer;
        ArrayList<DirectoryOS> directoryByName = new ArrayList<DirectoryOS>();

        for (DirectoryOS directoryO : directoryOS) {
            buffer = directoryO;
            directoryByName.add(buffer);
        }
        directoryByName = orderByDirectoryByName(directoryByName);
    }

    public ArrayList<DirectoryOS> orderByDirectoryByName(ArrayList<DirectoryOS> mv){
        ArrayList<DirectoryOS> bufferArray = new ArrayList<DirectoryOS>();
        DirectoryOS bufferElement;
        ArrayList<String> namesList = new ArrayList<String>() ;
        for (int i = 0 ; i < mv.size(); i++){
            bufferElement = mv.get(i);
            namesList.add(bufferElement.getName());
        }
        Collections.sort(namesList);
        
        return mv;
    }

}
