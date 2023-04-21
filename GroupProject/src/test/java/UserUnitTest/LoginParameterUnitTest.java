package UserUnitTest;
import org.junit.jupiter.api.*;
import Controllers.LoginController;
import Models.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class LoginParameterUnitTest {
    static LoginController loginObj;
    User actualValue;

    @BeforeAll
    public static void CreateLogin() {
        loginObj = new LoginController();
    }
    
    @BeforeEach
    public void SetValues() {
        actualValue = null;
    }

    @ParameterizedTest
    @ValueSource(strings = {"admin", "student","employee"})
    public void TestUserLogins(String usertext) {
        actualValue = loginObj.checkUser(usertext);
        Assertions.assertNotNull(actualValue);
    }

    @AfterEach
    public void CleanValues() {
        actualValue = null;
    }

    @AfterAll
    public static void DeleteLogin() {
        loginObj = null;
    }
}
