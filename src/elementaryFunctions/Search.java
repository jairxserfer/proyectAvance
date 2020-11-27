package elementaryFunctions;

import java.util.ArrayList;

public class Search {
    ArrayList<Object> mv = new ArrayList<>();
    Object elementSearch;

    public Search(ArrayList<Object> mv, Object elementSearch) {
        this.mv = mv;
        this.elementSearch = elementSearch;
    }

    public ArrayList<Object> getMv() {
        return mv;
    }

    public void setMv(ArrayList<Object> mv) {
        this.mv = mv;
    }

    public Object getElementSearch() {
        return elementSearch;
    }

    public void setElementSearch(Object elementSearch) {
        this.elementSearch = elementSearch;
    }

    public Object objectSearch(Object elementSearch2){
        Object buffer;
        for (int i = 0; i < mv.size(); i++){
            if(elementSearch2 == elementSearch)
            {
                return elementSearch;
            }

        }
        buffer = elementSearch;
        return buffer;
    }

}
