package elementaryFunctions;

import elements.DirectoryOS;
import elements.FileOS;

import java.util.ArrayList;
import java.util.Collections;

public class Order  {
    public void OrderFile(ArrayList<FileOS> mv){
        mv.sort(new OrderByFile());
    }

    public void OrderDirectory(ArrayList<DirectoryOS> mv){
        mv.sort(new OrderByDirectory());
    }
}
