package mycollections;

public class IndexRangeChecker extends ArrayIndexOutOfBoundsException {

    IndexRangeChecker(int index) {
        super("Index is out of range " + index + " .");
    }
}
