package elementaryFunctions;

import elements.FileOS;

import java.util.ArrayList;
import java.util.Collections;

public class Order  {
    public void OrderFile(ArrayList<FileOS> mv){
        Collections.sort(mv, new OrderByFile());
    }
}
