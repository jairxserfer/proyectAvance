package elementaryFunctions;

public class Copy {
    Object element, buffer;

    public Copy(Object element, Object buffer) {
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

    public Object copyFunction(){
        Object element2;
        element2 = element;
        return element2;
    }
}
