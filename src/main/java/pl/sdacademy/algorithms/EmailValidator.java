package pl.sdacademy.algorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    //    The combination means, email address must start with “_A-Za-z0-9-\\+” , optional follow by “.[_A-Za-z0-9-]”,
//    and end with a “@” symbol.
//    The email’s domain name must start with “A-Za-z0-9-“, follow by first level Tld (.com, .net) “.[A-Za-z0-9]”
//    and optional follow by a second level Tld (.com.au, .com.my) “\\.[A-Za-z]{2,}”,
//    where second level Tld must start with a dot “.” and length must equal or more than 2 characters.
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
    }
}
