package pl.sdacademy.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @Before
    public void init() {
        emailValidator = new EmailValidator();
    }

    @Test
    public void shouldValidateEmailWithShortDomain() {
        String email = "abc@aa.aa";

        boolean result = emailValidator.validate(email);

        assertTrue(result);
    }

    @Test
    public void shouldValidateEmailWithSubDomain() {
        String email = "abc@aa.aaaa.a.aa.aa";

        boolean result = emailValidator.validate(email);

        assertTrue(result);
    }

    @Test
    public void shouldValidateEmailWithSpecialCharacters() {
        String email = "some.email-with_some+characters@aa.aaaa.a.aa.aa";

        boolean result = emailValidator.validate(email);

        assertTrue(result);
    }

    @Test
    public void shouldNotValidateEmailWithMultipleAtCharacters() {
        String email = "email@withAddtionalATcharacter@example.com";

        boolean result = emailValidator.validate(email);

        assertFalse(result);
    }

    @Test
    public void shouldNotValidateEmailWithToShortGlobalDomain() {
        String email = "sample@example.c";

        boolean result = emailValidator.validate(email);

        assertFalse(result);
    }

    @Test
    public void shouldValidateEmailWithNumbersWithIt() {
        String email = "sample123NumberedEmail@example123.com";

        boolean result = emailValidator.validate(email);

        assertTrue(result);
    }

}