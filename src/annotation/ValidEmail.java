package annotation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class ValidEmail {
    private static final String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
      "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9\n"+ "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static boolean validEmail(final String email) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
