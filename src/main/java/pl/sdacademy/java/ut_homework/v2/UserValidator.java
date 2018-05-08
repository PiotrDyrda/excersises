package pl.sdacademy.java.ut_homework.v2;

import pl.sdacademy.java.ut_homework.User;

import java.util.regex.Pattern;

public class UserValidator {
    //https://stackoverflow.com/questions/8204680/java-regex-email
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    public boolean isValid(User user) {
        if (user == null) {
            return false;
        }
        return isNameValid(user) && isSurnameValid(user) && isAgeValid(user) && isEmailValid(user);
    }

    private boolean isNameValid(User user) {
        String userName = user.getName();
        if (userName == null) {
            return false;
        }
        return !userName.isEmpty();
    }

    private boolean isSurnameValid(User user) {
        String userSurname = user.getSurname();
        if (userSurname == null) {
            return false;
        }
        return !userSurname.isEmpty();
    }

    private boolean isAgeValid(User user) {
        Integer userAge = user.getAge();
        if (userAge == null) {
            return false;
        }
        return userAge >= 18;
    }

    private boolean isEmailValid(User user) {
        String email = user.getEmail();
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).find();
    }

}
