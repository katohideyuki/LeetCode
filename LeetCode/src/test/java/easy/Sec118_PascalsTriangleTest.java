package easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Sec118_PascalsTriangleTest extends Sec118_PascalsTriangle {
    @Nested
    class generateメソッドは整数numRowsを指定するとパスカルの三角形の最初のnumRowsを返します {

        @Test
        void 整数1を指定した場合_array変数の中身通りのリストが返却されること() {
            int array[][] = { { 1 } };
            List<List<Integer>> list = Arrays.stream(array).map(row -> Arrays.stream(row)
                    .boxed() // intをIntegerにボクシング
                    .collect(Collectors.toList()))
                    .collect(Collectors.toList());
            assertEquals(list, generate(1));
        }

        @Test
        void 整数5を指定した場合_array変数の中身通りのリストが返却されること() {
            int array[][] = { { 1 }, { 1, 1 }, { 1, 2, 1 }, { 1, 3, 3, 1 }, { 1, 4, 6, 4, 1 } };
            List<List<Integer>> list = Arrays.stream(array).map(row -> Arrays.stream(row)
                    .boxed() // intをIntegerにボクシング
                    .collect(Collectors.toList()))
                    .collect(Collectors.toList());
            assertEquals(list, generate(5));
        }
    }
}