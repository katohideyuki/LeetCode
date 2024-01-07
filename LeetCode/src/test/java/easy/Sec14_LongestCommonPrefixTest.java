package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Sec14_LongestCommonPrefixTest extends Sec14_LongestCommonPrefix {

    @Nested
    class Sec14_LongestCommonPrefixのテスト {

        @Test
        void CASE1のテスト() {
            assertEquals(TestData.CASE1.getExpected(), longestCommonPrefix(TestData.CASE1.getData()));
        }

        @Test
        void CASE2のテスト() {
            assertEquals(TestData.CASE2.getExpected(), longestCommonPrefix(TestData.CASE2.getData()));
        }

        @Test
        void CASE3のテスト() {
            assertEquals(TestData.CASE3.getExpected(), longestCommonPrefix(TestData.CASE3.getData()));
        }

        @Test
        void CASE4のテスト() {
            assertEquals(TestData.CASE4.getExpected(), longestCommonPrefix(TestData.CASE4.getData()));
        }
    }

    /* テストデータ
     * ケースと期待値を紐づけ、固有のメソッドで提供するようにしたが、ケースが増えると管理しづらそう。。
     */
    enum TestData {

        CASE1 /* 共通文字が存在するケース */ {
            public String[] getData() {
                return new String[] { "flower", "flow", "flight" };
            }

            public String getExpected() {
                return "fl";
            }
        },
        CASE2 /* 共通文字が存在しないケース */{
            public String[] getData() {
                return new String[] { "dog", "racecar", "car" };
            }

            public String getExpected() {
                return "";
            }
        },
        CASE3 /* 配列が空のケース */{
            public String[] getData() {
                return new String[] { "" };
            }

            public String getExpected() {
                return "";
            }
        },
        CASE4 /* 要素が1つのケース */{
            public String[] getData() {
                return new String[] { "a" };
            }

            public String getExpected() {
                return "a";
            }
        };

        // テストデータ
        public abstract String[] getData();

        // 期待値
        public abstract String getExpected();
    }
}
