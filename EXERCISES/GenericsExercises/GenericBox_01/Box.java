package GenericsExercises.GenericBox_01;

public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "java.lang.String: " + element;
    }
}