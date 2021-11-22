package annotation;

import java.util.ArrayList;
import java.util.List;

public class ValidName {
    public static boolean isValid(final String name) {
        List ValidName = new ArrayList();

                if (name == null || name.length() == 0) {
                    return false;
                }
                if (name.length() > 2 && name.length() < 30) {
                    return true;
                }
        return isValid(name);
    }
}
