package pl.sdacademy.algorithms;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PeselUtilityTest {

    private PeselUtility peselUtility;

    @Before
    public void init() {
        peselUtility = new PeselUtility();
    }

    @Test
    public void shouldValidatePesel1() {
        String pesel = "15311816343";

        boolean result = peselUtility.isValid(pesel);

        assertTrue(result);
    }

    @Test
    public void shouldValidatePesel2() {
        String pesel = "47080104905";

        boolean result = peselUtility.isValid(pesel);

        assertTrue(result);
    }

    @Test
    public void shouldNotValidatePesel1() {
        String pesel = "68061207649";

        boolean result = peselUtility.isValid(pesel);

        assertFalse(result);
    }

    @Test
    public void shouldNotValidatePesel2() {
        String pesel = "47042508793";

        boolean result = peselUtility.isValid(pesel);

        assertFalse(result);
    }

    @Test
    public void shouldDetectFemale() {
        String pesel = "89102719885";

        boolean result = peselUtility.isMale(pesel);

        assertFalse(result);
    }

    @Test
    public void shouldDetectMale() {
        String pesel = "30052916392";

        boolean result = peselUtility.isMale(pesel);

        assertTrue(result);
    }

}