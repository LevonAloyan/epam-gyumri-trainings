package annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    List ValidEmail = new ArrayList();
    private static final String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
      "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9\n"+ "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    Pattern pattern = Pattern.compile(regex);

    public boolean validEmail(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
