package elementaryFunctions;

public class Paste {
    Object element, buffer;

    public Paste(Object element, Object buffer) {
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

    public Object pasteFunction(Object element2){
        buffer = element2;
        element = buffer;
        return element;
    }
}
