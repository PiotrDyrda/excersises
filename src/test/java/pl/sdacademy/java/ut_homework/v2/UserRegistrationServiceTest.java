package pl.sdacademy.java.ut_homework.v2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.sdacademy.java.ut_homework.DatabaseConnection;
import pl.sdacademy.java.ut_homework.User;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserRegistrationServiceTest {

    @Mock
    private UserValidator validator;
    @Mock
    private DatabaseConnection db;
    @InjectMocks
    private UserRegistrationService service;

    @Test
    public void shouldNotSaveUserWhenValidationIsNotPassed() {
        User testedUser = new User();
        when(validator.isValid(eq(testedUser))).thenReturn(false);

        User savedUser = service.register(testedUser);

        verify(db, never()).save(any());
        assertNull(savedUser);
    }

    @Test
    public void shouldNotSaveUserWhenEmailAlreadyExistsInDatabase() {
        String userEmailAddress = "sample@example.com";
        User testedUser = new User();
        testedUser.setEmail(userEmailAddress);
        User userInDatabase = mock(User.class);
        when(validator.isValid(any())).thenReturn(true);
        when(db.getUserByEmail(eq(userEmailAddress))).thenReturn(userInDatabase);

        User savedUser = service.register(testedUser);

        verify(db, never()).save(any());
        assertNull(savedUser);
    }

    @Test
    public void shouldSaveUserInDatabaseWhenDataEmialWasNotRegistered() {
        String userEmailAddress = "sample@example.com";
        User testedUser = new User();
        testedUser.setEmail(userEmailAddress);
        when(validator.isValid(any())).thenReturn(true);
        when(db.getUserByEmail(eq(userEmailAddress))).thenReturn(null);

        User savedUser = service.register(testedUser);

        verify(db).save(eq(testedUser));
        assertNotNull(savedUser);
    }

}
