package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestSet01_TwoSum {
    // Aセット
    final int[] ARRAY_A = { 2, 7, 11, 15 }; // 引数1
    final int TARGET_A = 9;                 // 引数2
    final int[] EXPECTED_A = { 0, 1 };      // 期待値

    // Bセット
    final int[] ARRAY_B = { 3, 2, 4 };      // 引数1
    final int TARGET_B = 6;                 // 引数2
    final int[] EXPECTED_B = { 1, 2 };      // 期待値

    // Cセット
    final int[] ARRAY_C = { 3, 3 };         // 引数1
    final int TARGET_C = 6;                 // 引数2
    final int[] EXPECTED_C = { 0, 1 };      // 期待値

    // インスタンス
    final Sec01_TwoSum twoSum = new Sec01_TwoSum();

    @Nested
    class twoSumメソッドのテスト {
        @Test
        void Aセットを渡したらEXPECTED_Aが返却される() {
            assertArrayEquals(EXPECTED_A, twoSum.twoSum(ARRAY_A, TARGET_A));
        }

        @Test
        void Bセットを渡したらEXPECTED_Bが返却される() {
            assertArrayEquals(EXPECTED_B, twoSum.twoSum(ARRAY_B, TARGET_B));
        }

        @Test
        void Cセットを渡したらEXPECTED_Cが返却される() {
            assertArrayEquals(EXPECTED_C, twoSum.twoSum(ARRAY_C, TARGET_C));
        }
    }

    @Nested
    class otherSumメソッドのテスト {
        @Test
        void Aセットを渡したらEXPECTED_Aが返却される() {
            assertArrayEquals(EXPECTED_A, twoSum.otherSum(ARRAY_A, TARGET_A));
        }

        @Test
        void Bセットを渡したらEXPECTED_Bが返却される() {
            assertArrayEquals(EXPECTED_B, twoSum.otherSum(ARRAY_B, TARGET_B));
        }

        @Test
        void Cセットを渡したらEXPECTED_Cが返却される() {
            assertArrayEquals(EXPECTED_C, twoSum.otherSum(ARRAY_C, TARGET_C));
        }
    }
}
