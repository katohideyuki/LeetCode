package easy;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestSec03_RomanToInteger {

    // インスタンス
    private final Sec03_RomanToInteger r = new Sec03_RomanToInteger();

    @Nested
    class romanToIntメソッドのテスト {
        // テスト対象のprivateメソッドのインスタンス
        Method method;

        /**
         * 各テスト前の事前準備
         * テスト対象のprivateメソッドへのアクセスを許可する
         * @throws NoSuchMethodException
         * @throws SecurityException
         */
        @BeforeEach
        void setUp() throws NoSuchMethodException, SecurityException {
            method = Sec03_RomanToInteger.class.getDeclaredMethod("romanToInt", String.class);
            method.setAccessible(true);
        }

        @Test
        void IIIを渡したら3が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.III.name());
            assertEquals(result, TestData.III.getInteger());
        }

        @Test
        void LVIIIを渡したら58が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.LVIII.name());
            assertEquals(result, TestData.LVIII.getInteger());
        }

        @Test
        void MCMXCIVを渡したら1994が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.MCMXCIV.name());
            assertEquals(result, TestData.MCMXCIV.getInteger());
        }
    }

    @Nested
    class romanToIntOtherのテスト {
        // テスト対象のprivateメソッドのインスタンス
        Method method;

        /**
         * 各テスト前の事前準備
         * テスト対象のprivateメソッドへのアクセスを許可する
         * @throws NoSuchMethodException
         * @throws SecurityException
         */
        @BeforeEach
        void setUp() throws NoSuchMethodException, SecurityException {
            method = Sec03_RomanToInteger.class.getDeclaredMethod("romanToIntOther", String.class);
            method.setAccessible(true);
        }

        @Test
        void IIIを渡したら3が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.III.name());
            assertEquals(result, TestData.III.getInteger());
        }

        @Test
        void LVIIIを渡したら58が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.LVIII.name());
            assertEquals(result, TestData.LVIII.getInteger());
        }

        @Test
        void MCMXCIVを渡したら1994が返却される() throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            int result = (Integer) method.invoke(r, TestData.MCMXCIV.name());
            assertEquals(result, TestData.MCMXCIV.getInteger());
        }
    }

    /**
     * テストデータ
     */
    enum TestData {
        III(3), LVIII(58), MCMXCIV(1994);

        private int integer;

        public int getInteger() {
            return integer;
        }

        private TestData(int num) {
            this.integer = num;
        }
    }
}
