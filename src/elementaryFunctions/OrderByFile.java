package elementaryFunctions;


import elements.FileOS;

import java.util.Comparator;

public class OrderByFile implements Comparator<FileOS> {

    @Override
    public int compare(FileOS o1, FileOS o2) {
        return o1.getSize() - o2.getSize();
    }
}
