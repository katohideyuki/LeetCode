package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestSec02_PalindromeNumber {
    final int TRUE_VALUE = 123454321;
    final int FALSE_VALUE = 123456789;

    // インスタンス
    final Sec02_PalindromeNumber p = new Sec02_PalindromeNumber();

    @Nested
    class isPalindromeメソッドのテスト {
        @Test
        void 回文の値を渡したらtrueが返却される() {
            assertTrue(p.isPalindrome(TRUE_VALUE));
        }
        @Test
        void 回文ではない値を渡したらfalseが返却される() {
            assertFalse(p.isPalindrome(FALSE_VALUE));
        }
    }

    @Nested
    class bestIsPalindromeメソッドのテスト {
        @Test
        void 回文の値を渡したらtrueが返却される() {
            assertTrue(p.bestIsPalindrome(TRUE_VALUE));
        }
        @Test
        void 回文ではない値を渡したらfalseが返却される() {
            assertFalse(p.bestIsPalindrome(FALSE_VALUE));
        }
    }

    @Nested
    class otherIsPalindromeメソッドのテスト {
        @Test
        void 回文の値を渡したらtrueが返却される() {
            assertTrue(p.otherIsPalindrome(TRUE_VALUE));
        }
        @Test
        void 回文ではない値を渡したらfalseが返却される() {
            assertFalse(p.otherIsPalindrome(FALSE_VALUE));
        }
    }
}
