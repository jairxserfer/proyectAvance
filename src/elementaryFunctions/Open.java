package elementaryFunctions;

public class Open {
    Object element, buffer;

    public Open(Object element, Object buffer) {
        this.element = element;
        this.buffer = buffer;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Object getBuffer() {
        return buffer;
    }

    public void setBuffer(Object buffer) {
        this.buffer = buffer;
    }

    public Object openFunction(){
        return buffer;
    }

}
