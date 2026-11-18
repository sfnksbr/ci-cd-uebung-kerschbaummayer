import com.example.cicd.TextUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Additional tests from exercise 1, updated for the corrected palindrome behavior. */
class SuperTextUtilsTest {

    @Test
    void safeParseInt_validNumber_returnsValue() {
        assertEquals(42, TextUtils.safeParseInt("42"));
    }

    @Test
    void safeParseInt_invalidNumber_returnsZero() {
        assertEquals(0, TextUtils.safeParseInt("x"));
    }

    @Test
    void isPalindrome_caseInsensitive_expectedTrue() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }
}
