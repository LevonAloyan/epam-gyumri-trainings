package anotation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmail {

    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    public TestEmail(){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(final String email){

        matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public Pattern getPattern() {
        return pattern;
    }

    public Matcher getMatcher() {
        return matcher;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }
}
