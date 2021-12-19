package mycollections;

public class ElementValueChecker extends NullPointerException {
            <T> ElementValueChecker(T element) {
        super("Linked list can not contain a NULL element");
    }
}
