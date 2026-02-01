package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password.length() < 10
                || password.equals(repeatPassword)
                || password != null
                || repeatPassword != null) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
